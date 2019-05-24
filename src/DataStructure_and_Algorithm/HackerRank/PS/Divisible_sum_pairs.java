package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Divisible_sum_pairs {

    static Scanner scan = new Scanner(System.in);

    static void pairs(int n, int k, int arr[]) {

        int count = 0;
        int sum = 0;
        int m = 1;
        for (int i = 0; i < n; i++) {

            for (int j = m; j < n; j++) {
                sum = arr[i] + arr[j];

                if (sum % k == 0) {
                    count += 1;
                }
                sum = 0;
            }
            m++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        pairs(n, k, arr);
    }
}
