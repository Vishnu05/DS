package DataStructure_and_Algorithm.Sorting.SelectionSort;

import java.util.Scanner;

public class Searching {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        System.out.println("Input array size : ");
        int n = var.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the " + n + " elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = var.nextInt();
        }
        System.out.println("Enter the element for search");
        int x = var.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {

                //return x;

            }
        }
        }
    }
