package PS.HackerRank.PS;

import java.util.Scanner;

public class Angry_Professor {

    static void professor(int arr[], int k) {

        int count = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] <= 0) {
                count += 1;
            }
        }

        if (count >= k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scan.nextInt();
            int k = scan.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }

            professor(arr, k);
        }

    }

}
