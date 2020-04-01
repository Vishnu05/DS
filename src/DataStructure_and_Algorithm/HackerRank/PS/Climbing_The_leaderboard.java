package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Climbing_The_leaderboard {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int n = scan.nextInt();
        int lea[] = new int[n];

        for (int i = 0; i < n; i++) {
            lea[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int al[] = new int[m];

        for (int i = 0; i < m; i++) {
            al[i] = scan.nextInt();
        }

        for (int i = 0; i < m; i++) {

            int k = 0;
            for (int j = 1; j < n; j++) {

                if (lea[j] >= al[i] && lea[j] <= al[i]) {
                    System.out.println(j);
                    break;
                }
                k++;
            }

        }

    }
}
