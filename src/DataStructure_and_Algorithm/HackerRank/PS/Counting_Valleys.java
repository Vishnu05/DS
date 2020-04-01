package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Counting_Valleys {

    static void valley(char ar[]) {
        char u = 'U';
        char d = 'D';
        int U = 0;
        int D = 0;
        int count = 0;
        int temp = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == u) {
                U += 1;
            }

            if (ar[i] == d) {
                D -= 1;
            }

            count = U + D;

            if (count == 0 && ar[i] == 'U') {
                temp += 1;
            }

        }
        System.out.println(temp);
    }


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        String s = scan.next();
        char arr[] = s.toCharArray();

        valley(arr);

    }
}
