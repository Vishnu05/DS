package PS.HackerRank.PS;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Equality_in_an_Array {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(ar[i]);
        }

        int arr[] = new int[set.size()];

        Iterator ii = set.iterator();

        int h = 0;
        while (ii.hasNext()) {
            arr[h] = (int) ii.next();
            h++;
        }

        int arr1[] = new int[arr.length];


        for (int i = 0; i < arr1.length; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == ar[j]) {
                    count++;
                }
            }
            arr1[i] = count;
        }

        h = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[h] < arr1[i]) {
                h = i;
            }
        }

        h = arr1[h];

        h = h - ar.length;
        System.out.println(Math.abs(h));

        scan.close();
    }
}
