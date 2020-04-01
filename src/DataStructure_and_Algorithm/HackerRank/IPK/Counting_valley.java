package Java.HackerRank.IPK;

import java.util.Scanner;

public class Counting_valley {

    static int valley(char[] arr, int n) {

        char up = 'U';
        char dn = 'D';
        int set = 0;
        int set1 = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == up) {
                set += 1;
            }

            if (arr[i] == dn) {
                set1 += 1;
            }

            if (set == set1) {
                count += 1;
            }
        }

        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        String s = scan.next();

        char arr[] = s.toCharArray();

        System.out.println(valley(arr, n));

    }
}
