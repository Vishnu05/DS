package PS.HackerRank.Days_30;

import java.util.Scanner;

public class String_char {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        for (int i = 0; i < n; i++) {
            String s = ob.next();
            char[] arr = s.toCharArray();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(arr[j]);
                }

            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                } else {
                    System.out.print(arr[j]);
                }

            }
        }
    }
}
