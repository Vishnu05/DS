package Java.HackerRank.PS.Alg;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistance {

    static int distance(int a[]) {

        //    ArrayList<Integer> al = new ArrayList<>();
        /*Brute force approach o(n)2 this can be solved so simple */

        int counts = 999999999;
        int count11 = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                /* To check whether if the element exist or not*/
                if (a[i] == a[j]) {
                    //  al.add(Math.abs(i - j));
                    count11 = Math.abs(i - j);
                    /*Swapping values which is less than the big value integer*/
                    if (count11 < counts) {
                        counts = count11;
                    }
                }

            }


        }

        if (counts != 999999999) {
            return counts;
        } else {
            return -1;
        }
        /* too much of redundant code it can done in two lines  */
   /*     int j = 0;
        int count = 0;
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) < al.get(j)) {
                count = al.get(i);
                j = i;
            }
        }

        if (al.size() == 1) {
            count = al.get(0);
        }

            if (al.size() <= 0) {
                return -1;
            } else {
                return count;
          } */
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(distance(a));
        scan.close();
    }
}
