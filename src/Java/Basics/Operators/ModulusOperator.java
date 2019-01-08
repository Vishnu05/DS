package Java.Basics.Operators;

import java.util.Scanner;

public class ModulusOperator {

    static void modulus() {

        Scanner var =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the two values to Math Operations ");
        a=var.nextInt();
        b=var.nextInt();
        c = a + b;
        System.out.println("The value of addition is " + c);
        c = a - b;
        System.out.println("The value of Subtraction is " + c);
        c = a * b;
        System.out.println("The value of Multiplication is " + c);
        c = a / b; // it will give the quotient of the two values
        System.out.println("The value of Division is " + c);
        c = a % b; // the modulus operator will give the remainder of the a and b value embarrassing to say i don't know these many years
        System.out.println("The value of Modulus  is " + c);


    }

    public static void main(String args[]) {

        modulus();
    }
}


