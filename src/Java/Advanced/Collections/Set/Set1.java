package Java.Advanced.Collections.Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(24);
        ts.add(26);
        ts.add(12);
        ts.add(82);
        ts.add(62);
        ts.add(28);
        ts.add(2);

        ts.forEach(e -> System.out.println(e));

        String str = "Jordan blake";
        int arr[] = new int[ts.size()];

        Iterator i = ts.iterator();
        int j = 0;
        while (i.hasNext()) {
            arr[j] = (int) i.next();
            j++;
        }

        System.out.println(Arrays.toString(arr));
        int arr1[] = {1, 5, 21, 89};
        System.out.println(arr1);

    }
}
