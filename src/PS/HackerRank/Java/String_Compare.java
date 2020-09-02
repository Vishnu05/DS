package PS.HackerRank.Java;

import java.util.Arrays;
import java.util.Scanner;

public class String_Compare {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.next();
        int n = scan.nextInt();
        char[] ar = s.toCharArray();
        int len = ar.length * 2;
        String[] arr = new String[len];
        // String ss = "";
        for (int i = 0; i < len; i++) {
            String ss = "";
            int k = n + i;
            if (k != s.length())
                for (int j = i; j < k; j++) {
                    if (k != s.length())
                        ss += String.valueOf(ar[j]);

                }
            arr[i] = ss;
        }
        System.out.println(Arrays.toString(arr));
    }
}