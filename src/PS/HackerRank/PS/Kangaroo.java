package PS.HackerRank.PS;

import java.util.Scanner;

public class Kangaroo {

    static String s = "NO";

    static String kangaroo(int s1, int j1, int s2, int j2) {

        int count = s1 + j1;
        int count1 = s2 + j2;
        for (int i = 0; i < 20000; i++) {

            count += j1;
            count1 += j2;

            if (count == count1) {
                s = "YES";
                break;
            }
        }
        return s;
    }

    /* if (((s1 - s2) % (j1 - j2)) == 0) {
            return s = "YES";
        }*/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int s1 = scan.nextInt();
        int j1 = scan.nextInt();
        int s2 = scan.nextInt();
        int j2 = scan.nextInt();

        System.out.println(kangaroo(s1, j1, s2, j2));

    }
}
