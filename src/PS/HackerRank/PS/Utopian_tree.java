package PS.HackerRank.PS;

import java.util.Scanner;

public class Utopian_tree {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 1;
        int j = 0;
        int len = arr[arr.length - 1];
        for (int i = 0; i < len; i++) {

            if (i % 2 == 0) {
                count += count;

            } else {
                count++;
            }

            if (arr[j] == i) {
                j++;
                System.out.println(count);
            }

        }

    }
}
