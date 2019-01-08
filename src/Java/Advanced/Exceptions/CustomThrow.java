package Java.Advanced.Exceptions;

import java.io.PrintWriter;

public class CustomThrow {//extends Exception {

    static void mem() {
        try {
            throw new ArithmeticException("Exception is custom  ");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        try {
            mem();
        } catch (Exception e) {
            System.out.println(e);
        }
       // PrintWriter o=new PrintWriter();
    }
}
