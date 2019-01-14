package DataStructure_and_Algorithm.HackerRank.Day_10;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    static Scanner ob = new Scanner(System.in);

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
    }


    public static float mean(int arr[], float temp) {

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        temp = temp / (arr.length);
        return temp;
    }

    public static float median(int arr[], float temp) {
        int foo;
        foo = (arr.length / 2) - 1;

        for (int i = foo; i <= foo + 1; i++) {
            temp += arr[i];
        }
        temp = temp / 2;
        return temp;
    }

    public static int mode(int arr[], float temps) {

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];

            }
        }
        return temp;
    }

    public static void main(String[] args) {

        System.out.println("Input : ");
        int len = ob.nextInt();
        int arr[] = new int[len];
        float temp = 0f;
        input(arr);
        System.out.println(mean(arr, temp));
        Arrays.sort(arr);
        System.out.println(median(arr, temp));
        System.out.println(mode(arr, temp));

    }
}
