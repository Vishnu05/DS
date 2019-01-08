package Java.Advanced.Exceptions;

import java.util.Scanner;

public class Except {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int a;
        try {
            a = var.nextInt();
        } catch (Exception e) {
            System.out.println("O/P :" + e.getMessage() + e.getCause());
            //e.printStackTrace();
        }
        try {
            int as = 5 / 0;
        } catch (Exception e) {
            System.out.println("O/P :" + e.getMessage() + e.getLocalizedMessage() + e.getCause());
            e.printStackTrace();
        }
        try {

        } catch (Exception e) {
            System.out.println("O/P :" + e.getMessage());
        } finally {
            var.close();
            System.out.println("All the Exceptions are handled in order");
        }

    }
}
