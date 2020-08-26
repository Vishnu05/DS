package Java.Advanced.Exceptions;

import java.util.Scanner;

public class CheckingInput {

    /** to check the entered input is integer or not, simple program */

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("enter the input : ");
            String s = in.next();
            try {
                Integer.parseInt(s);
                System.out.println("you have entered the correct input data type : " + s);
                break;
            } catch (Exception e) {
                System.out.println("Please enter correct data type : ");
            }

        }
    }
}
