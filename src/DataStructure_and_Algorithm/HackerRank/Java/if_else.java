package DataStructure_and_Algorithm.HackerRank.Java;

import java.util.Scanner;


public class if_else {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        if (n % 2 == 0) {
            if (n <= 5) {
                System.out.println("Not Weird");
            } else if (n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
