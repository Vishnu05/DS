package Java.Advanced.Exceptions;

import java.util.Scanner;

// improve example
public class FinalBlock {

    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        int b = 5;
        for (int i = 0; i < b; i++) {

            try {
                System.out.println("Input");
                int a = var.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            finally {
                // whether the code exceptions is handled or not it's get always executed
                System.out.println("Anyways it gets Executed");
            }
            // this statement will terminate the thread
            //System.exit(5);
        }
    }
}
