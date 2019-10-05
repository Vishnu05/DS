package Java.Advanced.Collections.Collections;

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
        }
    }

}
