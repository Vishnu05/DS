package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Save_The_Prisoners {

    static int save(int p, int c, int s) {

        for (int i = 0; i < c; i++) {
            if (s == p && i < c - 1) {
                s = 1;
                continue;
            } else {
                s++;
            }

        }
        return s - 1;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int p = scan.nextInt();
            int c = scan.nextInt();
            int s = scan.nextInt();

            System.out.println(save(p, c, s));

        }

    }
}
