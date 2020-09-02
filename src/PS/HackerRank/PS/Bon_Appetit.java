package PS.HackerRank.PS;


import java.util.Scanner;

public class Bon_Appetit {

    static void appetit(int arr[], int rem, int a) {

        int count = 0;
        arr[rem] = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }

        count = count / 2;

        int count1 = a - Math.abs(count);

        if (count == a) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(count1);
        }

    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int n = scan.nextInt();
        int rem = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int actual = scan.nextInt();

        appetit(arr, rem, actual);
    }
}
