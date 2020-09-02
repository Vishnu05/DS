package PS.HackerRank.PS;

import java.util.Scanner;

public class Cat_and_a_Mouse {

    static String mouse(int a, int b, int c) {
        int count = 0;
        int count1 = 0;

        count = Math.abs(a - c);
        count1 = Math.abs(b - c);

        if (count < count1) {
            return "Cat A";
        } else if (count > count1) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(mouse(a, b, c));
        }
    }
}
