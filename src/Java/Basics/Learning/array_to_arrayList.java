package Java.Basics.Learning;

import java.util.*;

public class array_to_arrayList {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        //primitive type will throw an error. giving wrapper class is best practise
        Integer arr[] = {1, 2, 4, 5};

        //List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
        String a[] = {"noSQL", "hacker", "rank", "problems"};
        ArrayList<Integer> als = new ArrayList<>(Arrays.asList(arr));
        System.out.println(als);
        for (int ab : als) {
            System.out.println(ab);
        }

        arr[3] = 34;
        //   a[34]="dfd";
        // args[0] = "ds";
        @SuppressWarnings("hi")
        ArrayList[] oo = new ArrayList[4];
        System.out.println(args);
        System.out.println(args);

        TreeSet<Integer> ts1 = new TreeSet<>();

        ts1.add(2);
        ts1.add(24);
        ts1.add(26);
        ts1.add(82);
        ts1.add(624);
        ts1.add(28);
        ts1.add(2);

        int arr2[] = new int[ts1.size()];

        Iterator j = ts1.iterator();
        int k = 0;
        while (j.hasNext()) {
            arr2[k] = (int) j.next();
            k++;
        }

        System.out.println(Arrays.toString(arr));
        int arr1[] = {1, 5, 21, 89};
        System.out.println(arr1);

        String[] ss = {"Arrays", "are", "good", "Understanding it ?"};

        List<String> l = new ArrayList<>();

        for (String i : ss) {
            l.add(i);
        }
        System.out.println(l.get(3));

    }
}
