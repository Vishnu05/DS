package PS.HackerRank.PS;

import java.util.Scanner;

public class BetweenTwoSets {

    static int getTotalX(int a[], int b[]) {

        int aEnd = a.length - 1;
        int bStart = b[0];
        int count = 0, count1 = 0, count2 = 0, countLast = 0;
        int middle = a[aEnd] * 2;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % a[aEnd] == 0) {
                count++;
            }
            if (b[i] % bStart == 0) {
                count1++;
            }
            if (b[i] % middle == 0) {
                count2++;
            }
        }

      if ( count == count1) {
          countLast = 2;
      } if (count == count2 && count1 == count2) {
          countLast = 3;
      }

        return countLast;
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(getTotalX(a, b));

       // System.out.println(16 / 16);
       // System.out.println(16 % 4);

    }
}
