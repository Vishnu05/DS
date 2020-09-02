package PS.HackerRank.PS;

import java.util.Scanner;

public class The_Birthday_bar {

    static void bar(int arr[], int d, int m) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int temp = 0;
            int foo = m + i;
            int fo = 0;
            if (foo <= arr.length)
                for (int j = i; j < foo; j++) {
                    temp += arr[j];

                    fo++;

                    if (fo == m) {
                        if (temp == d) {
                            count += 1;
                        }
                    }
                }
        }

        System.out.println(count);
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int d = scan.nextInt();
        int m = scan.nextInt();

        bar(arr, d, m);

        scan.close();
    }
}
