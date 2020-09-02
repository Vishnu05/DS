package Java.HackerRank.IPK;

import java.util.Scanner;

public class Sock_merchant {

    static int sock(int arr[], int n) {

        int count = 0;
        int j = 0;
        int k = -1;

        /* worst brute force */
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                for (j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count += 1;
                        arr[j] = k;
                        k--;
                        break;
                    }
                }
            }
        }

        /* alternatively using set and by contains key we can check and remove o(n) i think
         * above solution is worst and non acceptable */
        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(sock(arr, n));

    }

}
