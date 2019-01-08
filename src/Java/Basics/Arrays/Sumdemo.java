package Java.Basics.Arrays;

import java.util.Scanner;

class SumDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Enter the elements:");
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements is:" + sum);
    }
}