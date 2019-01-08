package Java.Basics.Prob;

import java.util.Scanner;

public class IO_int_or_not {
    static Scanner ob = new Scanner(System.in);

    static String c = "a";

    static String fun() {
        System.out.println("Enter the Input :");
        c = ob.next();
        return c;
    }

    public static void main(String args[]) {

        boolean con = true;
        //char b = '5';

        while (con) {
            if (c.matches("[0-9]+")) {
                System.out.println("true");
                con = false;
            } else {
                fun();
            }
        }

        System.out.println(c.split("a"));
        char s = '1';
        while (con) {
            if (Character.isDigit(s)) {
              //  System.out.println("True is about char");
                con=false;
            }
        }
//        while(con){
//            if(Character.isDigit(b)){
//                con=false;
//            }
//        }
    }
}
