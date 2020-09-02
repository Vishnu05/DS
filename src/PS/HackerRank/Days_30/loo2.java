package PS.HackerRank.Days_30;

import java.util.*;

public class loo2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int temp = 0, k = 1, foo = 0;
            System.out.print(temp = (a + (b * k)));
            System.out.print(" ");
            for (int j = 1; j < n; j++) {
                b += b;
                temp = temp + (b * k);
                System.out.print(temp + " ");

            }
            System.out.println();
        }
        in.close();
    }
}
