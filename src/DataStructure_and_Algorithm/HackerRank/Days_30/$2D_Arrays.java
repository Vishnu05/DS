package Java.HackerRank.$30Day;

import java.util.Scanner;

public class $2D_Arrays {

    /* No idea about logic */

    static void $2d(int arr[][], int n) {

        int len = n * n;

        int count[] = new int[len];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {


            }
        }

    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(arr.length);
        $2d(arr, n);
    }
}
