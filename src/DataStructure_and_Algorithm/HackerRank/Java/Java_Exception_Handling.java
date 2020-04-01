package Java.HackerRank.Java;

import java.util.Scanner;

public class Java_Exception_Handling {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e );
        }
    }
}
