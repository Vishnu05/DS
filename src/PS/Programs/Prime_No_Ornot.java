package PS.Programs;

import java.awt.*;
import java.util.Scanner;

public class Prime_No_Ornot {

    static void prim() {
        int prime = 11;
        boolean check = false;

        for (int i = 2; i < prime; i++) {

            if (prime % i == 0) {
                check = true;
            }
        }
        if (!check) {
            System.out.println("It is a Prime No :" + prime);
        } else
            System.out.println("It is not a Prime No :" + prime);
    }

    public static void main(String args[]) {

        int m;
        boolean flag = true;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number to Check Whether the number is Prime or not");
        m = ob.nextInt();
        int count = 0;

        for (int n = 2; n < m; n++) {
            /*for(int n=2;n<m;n++) this condition is also applicable
             loop play a important role here when the value of m is given by the user
            and it will check the modulus with n and concurrently it will divide the all possible of n so that the remainder can have 0 or
           no number can be divisible the number is prime or else it is not a prime number */
            if (m % n == 0) {
                flag = false;
            }
            count += 1;

        }
        System.out.println("The count is " + count);
        if (flag) {
            System.out.println("It is a Prime Number " + m);

        } else {
            System.out.println("The given number is Not a Prime Number :" + m);
        }

        Point origin = new Point();
        Rectangle obj = new Rectangle(5, 100);
        //obj.height;
    }

}
