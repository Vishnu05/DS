package DataStructure_and_Algorithm.Pattern;

import java.util.Scanner;

public class DoublePattern {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("" + i);
        }
        for (int i = 5; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }

    }
}