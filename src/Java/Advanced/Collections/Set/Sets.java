package Java.Advanced.Collections.Set;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        /*Set is data structure where it stores only unique elements eliminates the duplicate ones
         * hashSet does not follow the order of insertion and reterival
         * LinkedHashSet unique element and it is ordered in how the data is stored
         * TreeSet which stores in Ascending order  */
        Set<String> ob = new HashSet<>();

        Scanner obj = new Scanner(System.in);

        int len = obj.nextInt();

        for (int j = 0; j <= len; j++) {
            /*Upper case to lowercase*/
            String a = obj.nextLine();
            a = a.toLowerCase();
            String arr[] = a.split(" ");
            int i = 0;
            for (String ab : arr) {
                ob.add(arr[i]);
                i++;
            }
            List<String> list = new ArrayList<>(ob);
            System.out.println(list);

            /*for(String ar: ob){
                System.out.print(ar+" ");
            }*/

            ob.clear();

            /** Retain call in set is very useful when we do union between two elements **/
            HashSet<Integer> hs1 = new HashSet<>();
            HashSet<Integer> hs2 = new HashSet<>();

            /** adding element for hs1 **/
            hs1.add(2);
            hs1.add(4);
            hs1.add(5);
            hs1.add(3);
            hs1.add(7);

            /** adding element for hs2 **/
            hs2.add(1);
            hs2.add(2);
            hs2.add(6);
            hs2.add(8);
            hs2.add(7);

            /** union between two sets for common values */
            /** before retain all */
            System.out.println("before retain all : " + hs1);
            hs1.retainAll(hs2);
            /** after retain all */
            System.out.println("after retain all : " + hs1);

        }
    }

}
