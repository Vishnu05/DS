package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class BirthdayCandles {

    public static int bday(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {

            if (arr[j] < arr[i]) {
                j = i;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[j] == arr[i]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(bday(arr));
    }
}
