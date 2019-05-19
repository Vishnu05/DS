package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Halloween_party {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int choc = scan.nextInt();
            int temp = 0;
            int foo = 0;

            temp = choc / 2;
            foo = choc - temp;

            foo = foo * temp;
            System.out.println(foo);
        }
        scan.close();
    }
}
