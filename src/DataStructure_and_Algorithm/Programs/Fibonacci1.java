package DataStructure_and_Algorithm.Programs;

import java.util.Scanner;

class Fibonacci1 {

    public static void main(String[] args) {

        int a = 0, b = 1, dummy, forloop, count;

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number to print the series of Fibonacci");
        count = ob.nextInt();


        for (forloop = 0; forloop < count; forloop++) {

            dummy = a + b;
            a = b;
            b = dummy;

            System.out.print(dummy+" ");
        }
    }
}
