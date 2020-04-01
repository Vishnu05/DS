package Java.Prob.Probs;

import java.util.Scanner;

public class InputInt {

    Scanner ob = new Scanner(System.in);

    static String a = "";

    String mem() {
        System.out.println("Input : ");
        a = ob.next();
        return a;
    }

    public static void main(String[] args) {

        InputInt obj = new InputInt();
        boolean con = true;

        while (con) {

            if (a.matches("[0-9]+")) {
                System.out.println("true");
                con = false;
            } else {
                obj.mem();
            }
        }
    }
}

