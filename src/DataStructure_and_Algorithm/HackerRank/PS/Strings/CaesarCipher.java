package DataStructure_and_Algorithm.HackerRank.PS.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        String s = scan.next();
        int k = scan.nextInt() % 26;
        char ar[] = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (Character.isAlphabetic(ar[i])) {
                ar[i] = (char) (ar[i] + k);
            }
        }
        s = String.valueOf(ar);
        System.out.println(s);
    }
}
