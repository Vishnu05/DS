package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Compare_the_triplets {

    static void triplets(int arr[], int brr[], int n) {

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] > brr[i]) {
                count += 1;
            } else if (arr[i] < brr[i]) {
                count1 += 1;
            }
        }

        System.out.println(count + " " + count1);
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 3;
        int arr[] = new int[n];
        int brr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            brr[i] = scan.nextInt();

        }

        triplets(arr, brr, n);
    }
}
