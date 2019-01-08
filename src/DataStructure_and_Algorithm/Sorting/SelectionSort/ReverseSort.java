package DataStructure_and_Algorithm.Sorting.SelectionSort;

import java.util.Scanner;

public class ReverseSort {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in); // In=null -> input stream
        System.out.println("Input size of array : ");
        int b = var.nextInt();
        int a[] = new int[b];
        System.out.println("Enter the " + b + " elements of array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = var.nextInt();
        }
        System.out.println("The sorted list are : ");
        for (int i = 0; i < a.length; i++) {
            int min_index = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j] > a[i]) {
                    min_index = j;
                    // System.out.println(j); // this is useless it a condition idk i'm wrong
                }
                // System.out.println("The for loop checks every integer and returns value : "+j);
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
            min_index++;
            System.out.println(temp);
        }
    }
}

