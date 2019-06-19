package Programs;

import java.util.Scanner;

public class PatternStar {

    static int n;

    static void pattern(int n) {

        int k = 2;
        k = k * n - 2;

        for (int i = 0; i <= n; i++) {

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
        System.out.println("Enter the size of Pattern : ");
        n = var.nextInt();
        pattern(n);
    }
}
