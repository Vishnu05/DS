package Java.Basics.Prob;

import java.util.Scanner;

public class addOperator {

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers to add");

        int a = obj.nextInt();
        int b = obj.nextInt();

        for (int i = 0; i < b; i++) {
            a++;
        }
        System.out.println("Addition of two numbers " + a);
    }
}
