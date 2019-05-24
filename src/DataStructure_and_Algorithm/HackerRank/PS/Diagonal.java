package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Diagonal {

    public static int dia(int arr[][]) {

        int n = arr.length;
        int count = 0;
        int count1 = 0;
        int result = 0;

        for (int i = 0, j = 0; i < n; i++) {
            count += arr[i][j];
            j += 1;
        }

        for (int i = 0, j = arr.length - 1; i < n; i++) {
            count1 += arr[i][j];
            j -= 1;
        }

        result = count - count1;
        result = Math.abs(result);

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }

        }

        System.out.println(dia(arr));
    }
}
