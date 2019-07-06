package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Sherlock_and_Squares {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();

            a = (int)Math.sqrt(a);
            b = (int)Math.sqrt(b);

            System.out.println(Math.abs(a - b));

        }

    }
}
