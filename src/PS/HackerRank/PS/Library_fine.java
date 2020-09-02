package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Library_fine {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String r = scan.nextLine().trim();
        String e = scan.nextLine().trim();

        String rr[] = r.split(" ");
        String ee[] = e.split(" ");
        int rd = Integer.parseInt(rr[0]);
        int rm = Integer.parseInt(rr[1]);
        int ry = Integer.parseInt(rr[2]);
        int ed = Integer.parseInt(ee[0]);
        int em = Integer.parseInt(ee[1]);
        int ey = Integer.parseInt(ee[2]);

        if (ry <= ey) {


            if (rm <= em) {

                if (rd <= ed) {
                    System.out.println(0);
                } else {
                    System.out.println(15 * (Math.abs(ed - rd)));
                }

            } else {

                System.out.println(500 * (Math.abs(em - rm)));
            }

        } else {
            System.out.println(10000);
        }
    }
}
