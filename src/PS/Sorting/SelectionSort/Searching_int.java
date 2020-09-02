package PS.Sorting.SelectionSort;

import java.util.Scanner;

  /*Time complexity will increase when n get larger
  * Binary search tree preferred*/

public class Searching_int {

    static int search() {
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
        boolean d = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                d = true;
            }
        }
        if (d) {
            System.out.println("Element found :" + x);
        } else
            System.out.println("Element not found :" + x);
        return x;
    }

    public static void main(String args[]) {

        search();

    }
}
