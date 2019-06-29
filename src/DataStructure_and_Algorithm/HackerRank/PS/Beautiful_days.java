package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Beautiful_days {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int s = scan.nextInt();
        int e = scan.nextInt();
        int d = scan.nextInt();
        int a, b, reverse = 0;
        for (int i = s; i < e; i++) {

            while (s > 0) {
                a = reverse * 10;
                b = s % 10;
                reverse = a + b;
                s = s / 10;
            }
        }
    }
}
