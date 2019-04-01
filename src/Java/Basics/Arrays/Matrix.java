package Java.Basics.Arrays;

import java.util.Scanner;

public class Matrix {

    public static void main(String args[]) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the element of A matrix : ");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                a[i][j] = ob.nextInt();
            }
        }

        System.out.println("Enter the elements of B matrix : ");
        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b.length; j++) {

                b[i][j] = ob.nextInt();
            }
        }

        int temp = 0;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < a.length; j++) {

                    temp = a[i][j] + b[i][j];
                    System.out.print("  " + temp);
                }
                System.out.println();
            }
        }
    }
}
