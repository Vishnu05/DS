package Java.Basics.Strings;

import java.util.Scanner;

public class Standard_deviation {

    public static void deviation(int arr[], int n) {

        int m = n / 2;

        int j = m;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - arr[m];
            arr[i] = (int) Math.pow(arr[i], arr[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += arr[i];
        }
        count = count / n;

        count = (int) Math.sqrt(count);

        System.out.println(count);
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        deviation(arr, n);
    }
}
