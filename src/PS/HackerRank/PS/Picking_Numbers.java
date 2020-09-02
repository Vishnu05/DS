package PS.HackerRank.PS;

import java.util.Scanner;

public class Picking_Numbers {

    static int numbers(int arr[]) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if ((arr[i] - arr[j]) == 0 || (arr[i] - arr[j]) == 1) {
                    count += 1;
                }

            }
        }
        return count;

    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(numbers(arr));

    }
}
