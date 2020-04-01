package Java.Basics.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {

        int j = 0, c;
        System.out.println(" Enter the Input");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of loops to be executed....");
        c = ob.nextInt();
        int b[] = new int[c];
        for (int i = 0; i < c; i++) {
            b[i] = ob.nextInt();
        }
        System.out.println("The length of the array :" + b.length);
        System.out.println("Before sorting the arrays");
        while (j < b.length) {
            System.out.println(b[j]);
            j++;
        }
        // here it comes sorting
        if (-1 <= 0) {
            System.out.println("The statement is true");
        }
        System.out.println("Reverse Mechanism");
        for (int k = c - 1; k >= 0; k--) {
            System.out.println(b[k]);
        }
    }

    public static void main(int id){


    }
}
