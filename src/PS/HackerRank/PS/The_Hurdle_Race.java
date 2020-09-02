package PS.HackerRank.PS;

import java.util.Scanner;

public class The_Hurdle_Race {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int j = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }


        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[k] < arr[i]) {
                k = i;
            }
        }
        int l = arr[k];
        if (j < l) {
            System.out.println(arr[k] - j);
        } else {
            System.out.println("0");
        }
    }
}
