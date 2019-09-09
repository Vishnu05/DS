package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Apples_and_Oranges {

    static void apples(int s, int t, int a, int b, int arr[], int[] arr1) {

        int count = 0;
        int count1 = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = a + arr[i];
            if (sum >= s && sum <= t) {
                count += 1;
            }
        }

        sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum = b + arr1[i];
            if (sum >= s && sum <= t) {
                count1 += 1;
            }
        }

        System.out.println(count + "\n" + count1);
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String st[] = scan.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);

        String ab[] = scan.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String mn[] = scan.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int arr[] = new int[m];
        int arr1[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        apples(s, t, a, b, arr, arr1);
    }
}
