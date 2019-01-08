package Java.Advanced.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws extends NullPointerException {

    static void thros(int a){ //throws InputMismatchException {

        if(a>=0){
            System.out.println(" The error ");
            throw new InputMismatchException("Higher than zero");

        }else{
            System.out.println("Print wrong number");
        }
    }

    public static void main(String args[]) {

        try {
            thros(5);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
