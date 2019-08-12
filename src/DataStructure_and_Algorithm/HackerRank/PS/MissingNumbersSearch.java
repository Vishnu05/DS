package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MissingNumbersSearch {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int br[] = new int[m];
        for (int i = 0; i < m; i++) {
            br[i] = scan.nextInt();
        }

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(ar[i]);
        }

        int arhs[] = new int[hs.size()];

        Iterator ii = hs.iterator();

        int k = 0;
        while (ii.hasNext()) {
            arhs[k] = (int) ii.next();
            k++;
        }

        int ar1[] = new int[arhs.length];
        int br1[] = new int[arhs.length];

        for (int i = 0; i < arhs.length; i++) {
            int temp = 1;

            for (int j = 0; j < n; j++) {
                if (arhs[i] == ar[j]) {
                    temp++;
                }
            }
            ar1[i] = temp;
        }

        for (int i = 0; i < arhs.length; i++) {
            int temp = 1;

            for (int j = 0; j < m; j++) {
                if (arhs[i] == br[j]) {
                    temp++;
                }
            }
            br1[i] = temp;
        }

        for (int i = 0; i < arhs.length; i++) {
            if (ar1[i] == br1[i]) {
                continue;
            } else {
                System.out.println(arhs[i]);
            }
        }
    }
}

