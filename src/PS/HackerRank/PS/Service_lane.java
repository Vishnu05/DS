package PS.HackerRank.PS;

import java.util.Scanner;

public class Service_lane {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];
        int c = scan.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < c; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();

            int temp = s;

            for (int j = s + 1; j <= e; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }

            System.out.println(arr[temp]);

        }
    }
}
