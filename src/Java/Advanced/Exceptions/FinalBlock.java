package Java.Advanced.Exceptions;

import java.util.Scanner;

// improve example
public class FinalBlock {

    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        int b = 5;

        /**
         * Here is the tricky thing, if there is no catch it is getting executed 5 times
         * if there is catch, in the first time it is handled and for the rest of the program it is
         * taking the same instance
         */
        for (int i = 0; i < b; i++) {

            try {
                System.out.println("Input");
                int a = var.nextInt();
            } /*catch (Exception e) {
                System.out.println(e);
            }*/ finally {
                /** whether the code exceptions is handled or not it's get always executed */
                System.out.println("Anyways it gets Executed");
            }
            // this statement will terminate the thread
            //System.exit(5);
        }
    }
}
