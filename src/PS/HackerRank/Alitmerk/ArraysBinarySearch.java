package PS.HackerRank.Alitmerk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysBinarySearch {

    public static void main(String[] args) {

        int a [] = new int[5];

        for (int i = 5; i > 0; i--) {
            a[5- i] = i;
        }

        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 4));

        ArrayList e = new ArrayList();
        e.add(1);
        e.ensureCapacity(4);
        System.out.println(e.size());

        int b = 96;
        System.out.println(b >> 4);
        System.out.println(b >>> 4);
    }
}
