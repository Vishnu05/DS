package Java.HackerRank.$30Day;

import java.util.Scanner;

public class Nested_logic {


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] a = scan.nextLine().split(" ");
        String[] e = scan.nextLine().split(" ");

        int ad = Integer.parseInt(a[0]);
        int am = Integer.parseInt(a[1]);
        int ay = Integer.parseInt(a[2]);

        int ed = Integer.parseInt(e[0]);
        int em = Integer.parseInt(e[1]);
        int ey = Integer.parseInt(e[2]);

        int count = 0;

        if (ey <= ay) {
            if (em < am) {
                System.out.println("0");
            }
        }

        /* code reuseability */
        if (ey == ay) {
            if (am == em) {
                if (ad == ed) {

                } else {
                    count = 15 * (ad - ed);
                    System.out.println(count);
                    return;
                }
            } else {
                count = 500 * (am - em);
                System.out.println(count);
                return;
            }
        } /*else if (ey > ay + 1 && ey + 1 == ay + 1) {
            System.out.println("10000");
        }*/ else {
            System.out.println("0");
        }
    }
}
