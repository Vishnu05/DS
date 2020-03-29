package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class DrawingWorkBooks {

    static int pageCount(int n, int p) {
        int total = n / 2;
        int right = p / 2;
        int left = total - right;

        if (right < left) {
            return right;
        } else {
            return left;
        }

    }

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

        // Number of pages n and p is the page we want to turn
        int n = in.nextInt();
        int p = in.nextInt();

        System.out.println(pageCount(n, p));

    }
}
