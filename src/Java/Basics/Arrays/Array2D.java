package Java.Basics.Arrays;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[][] = new int[2][2];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // finding the array element
        System.out.println("Enter the Element to search in the array : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        try {
            System.out.println("Element found : " + arr[a][b]);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
