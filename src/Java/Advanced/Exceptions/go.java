package Java.Advanced.Exceptions;

import java.util.Scanner;

public class go {
    public static void main(String[] args) {

        /*This is an example of ctrl + alt + t*/
        try {
            if (true) {
                System.out.println(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


        int a = 10;

        try {
            a = a / 0;
            System.out.println(a);
        } finally {
            System.out.println("it is finally block : ");
        }

        System.out.println("there is no catch statement ");
    }
}
