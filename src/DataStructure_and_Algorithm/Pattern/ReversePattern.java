package DataStructure_and_Algorithm.Pattern;

import java.util.Scanner;

public class ReversePattern {

    public static void main(String args[]) {

        /* Need to use decrement operator for reducing the size of array*/
        for (int i = 5; i >= 0; i--) {
            // System.out.println("it");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

