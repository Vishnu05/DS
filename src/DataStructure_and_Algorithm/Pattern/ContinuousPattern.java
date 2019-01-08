package DataStructure_and_Algorithm.Pattern;

import java.util.Scanner;

public class ContinuousPattern {

    public static void ordered(int n) {

        int num = 1;
        /** Two loops for every pattern design
         * first loops for rows, second one for columns
         */
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                // it prints first elements
                System.out.print(num + " ");
                //get incremented each time
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the size of Elements : ");
        int n = var.nextInt();
        ordered(n);

    }
}
