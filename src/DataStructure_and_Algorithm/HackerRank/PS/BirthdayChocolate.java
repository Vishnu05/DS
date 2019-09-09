package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayChocolate {

    static int choco(int s[], int d, int m, int n) {

        int startingIndex = 0;
        int result = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            startingIndex = i;

            try {
                for (int j = 0; j < m; j++) {
                    total += s[startingIndex + j];
                }
            } catch (Exception e) {
                break;
            }

            if (total == d) {
                result++;
            }
            total = 0;
        }
        return result;
    }


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int s[] = new int[n];

        int d = scan.nextInt();
        int m = scan.nextInt();

        for (int i = 0; i < n; i++) {
            s[i] = scan.nextInt();
        }

        System.out.println(choco(s, d, m, n));
    }
}
