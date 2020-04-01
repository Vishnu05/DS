package Java.Basics.Basics;

import java.util.Scanner;

public class Prime_No_Ornot {

    public static void main(String args[]) {

        int m;
        boolean flag = true;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number to Check Whether the number is Prime or not");
        m = ob.nextInt();

        for (int n = 2; n <= m / 2; n++) {
            //for(int n=2;n<m;n++) this condition is also applicable
// loop play a important role here when the value of m is given by the user
            // and it will check the modulus with n and concurrently it will divide the all possible of n so that the remainder can have 0 or
            // no number can be divisible the number is prime or else it is not a prime number
            if (m % n == 0) {

                flag = false;

            }
        }
        if (flag) {
            System.out.println("It is a Prime Number " + m);

        } else {
            System.out.println("The number is Not a Prime Number" + m);
        }
       /* if(inputno/1==inputno && inputno/2==0){

            System.out.println("It is a prime number");
        }else
        {
            System.out.println("Not a prime number");
        }*/
    }
}
