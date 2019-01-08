package Java.Basics.Prob;

import java.util.Scanner;

public class Factorial {

    /* Using recursive */
    /* inception dreams to inner dreams  */
    public static int recursive(int n) {
        if (n < 1) {
            return 1;
        } else return n * recursive(n - 1);
    }

    /*Iterative*/
    public static int iterative(int n) {
        int temp = 1;
        if (n < 1)
            return 1;
        if(n<0)
            return 0;
       // if(n<)
        else
            for (int i = 1; i <= n; i++) {
                temp *= i;
            }
        return temp;
    }

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        System.out.println("Factorial of " + n + " :" + recursive(n));
        System.out.println(iterative(n));
    }
}
