package Java.HackerRank.PS.Alg;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Median {


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int med = (arr.length) / 2;
        Arrays.sort(arr);
        System.out.println(arr[med]);
        scan.close();
    }
}
