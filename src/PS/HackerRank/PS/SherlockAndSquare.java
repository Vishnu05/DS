package Java.HackerRank.PS.Alg;

import java.util.Scanner;

  /* Brute force approach time complexity is high*/
  /*Need optimize solution*/
public class SherlockAndSquare {

    static int squares(int a, int b) {

        int count = 0;
  /*this is o(n) solution maybe I need o(log n)*/
        for (int i = a; i <= b; i++) {
            double temp = 0;
            temp = Math.sqrt(i);

            if (temp == (int)temp) {
                count++;
            }
        }
        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(squares(a, b));
        }
    }
}
