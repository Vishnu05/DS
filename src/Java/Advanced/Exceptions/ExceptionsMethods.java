package Java.Advanced.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMethods {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        int b;
        int a[] = new int[]{1, 58, 7, 9, 4};

        try {
            // Array indexoutofbounce
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());
        }

        System.out.println("Enter the input :");
        try {
            b = var.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            //Arithmetic exception
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String var1 = "Exception";
        //Number form exception
        try {
            int c = Integer.parseInt(var1);
        } catch (Exception e) {
            System.out.println(e);
        }

        String ex = null;
        try {
            //Null pointer exceptions
            System.out.println(ex.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Multiple catch
        float ca;
        System.out.println("Boolean ");
        try {
            ca = var.nextFloat();
        } catch (ArithmeticException e) {
            System.out.println("First" + e);
        } catch (InputMismatchException e) {
            System.out.println("Second" + e);
        } catch (Exception e) {
            System.out.println("Final" + e);
        }
    }
}
