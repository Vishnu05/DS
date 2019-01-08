package DataStructure_and_Algorithm.Pattern;

import java.util.Scanner;

public class Triangle {

    public static void triangle(int n) {

        // Number of spaces
        int k = 2 * n - 2;
        System.out.println("value of k : " + k);
        for (int i = 0; i <= n; i++) {
            // The k will loop for spaces
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the Triangle size pattern : ");
        int n = var.nextInt();
        triangle(n);
    }
}
