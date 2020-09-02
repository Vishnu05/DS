package Java.HackerRank.IPK;

import java.util.Scanner;

public class Jump_on_the_clouds {

    static Scanner scan = new Scanner(System.in);

    static int clouds(int arr[], int n) {

        int z = 0;
//        int o = 1;
        int count = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] == z) {
                if (arr[i] + 1 == z) {
                    if (arr[i] + 2 == z) {
                        count += 1;
                    }
                } else {
                    count += 1;
                }
            } else {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        clouds(arr, n);

    }
}
