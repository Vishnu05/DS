package PS.Sorting.SelectionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the Array size ..");
        int array_size = var.nextInt();
        int a[] = new int[array_size];
        System.out.println("Enter the Array element of " + array_size + " numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = var.nextInt();
        }
        System.out.println("The sorted element are : Selection sort  :");
        for (int i = 0; i <= a.length - 1; i++) {
            int index = i;
            try {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[index]) {
                        index = j;
                    }
                }
            } catch (Exception e) {
                System.out.println("The exception is  " + e.getLocalizedMessage());
            }
            // System.out.println("Index is "+index);
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
            System.out.println(temp);

        }

    }


    public static void mains() {
        int a = 10;
        if (a < 10) {
            a = 5;
        }
        System.out.println(a);
    }
}
