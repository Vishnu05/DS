package Java.HackerRank.Java;

import java.util.Scanner;

public class smallest_no {

    public static void main(String args[]) {

        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }

        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
