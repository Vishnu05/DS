package Java.Advn.DS;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    /* Iterative solution */
    static int bs(int arr[], int bs) {

        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = (l + r) / 2;

            if (arr[m] == bs) {
                return m;
            }

            /* ignoring the left*/
            if (arr[m] < bs) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }

        return -1;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6, 10, 15};

        System.out.println("Enter the element to be searched : ");
        int bs = scan.nextInt();

        Arrays.sort(arr);

        int res = bs(arr, bs);

        if (res == -1) {
            System.out.println("Binary Search ended: lost in space");
        } else {
            System.out.println("Found something better :" + res);
        }
    }
}
