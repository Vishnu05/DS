package PS.HackerRank.Day_10;

import java.util.Scanner;

public class Weighted_mean {

    static Scanner ob = new Scanner(System.in);

    static public void input(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = ob.nextInt();
        }
    }

    static public float multiply(int arr[], int arr1[]) {

        int i = 0, j = 0;
        float temp = 0, foo = 0;

        for (i = 0; i < arr.length && j < arr1.length; i++, j++) {

            temp = arr[i] * arr1[j];
            foo += temp;
        }

        float temp1 = 0;
        for (i = 0; i < arr1.length; i++) {
            temp1 += arr1[i];
        }
        //System.out.println(temp1);
        foo = foo / temp1;
        return foo;
    }

    public static void main(String args[]) {

        int len = ob.nextInt();
        int arr[] = new int[len];
        int arr1[] = new int[len];
        input(arr, arr1);
        System.out.println(multiply(arr, arr1));

    }

}
