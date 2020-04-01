package Java.HackerRank.IPK;

import java.util.Scanner;

public class Repeated_String {

    static int string(String s, double n) {

        char[] arr = s.toCharArray();
        int count = 0;
        int len = arr.length;
        String ar[] = new String[(int) n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            (ar[i]) = String.valueOf((arr[j]));
            j++;

            if (j == len) {
                j = 0;
            }
        }
        //System.out.println(String.valueOf(ar));
        j = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i].equals(String.valueOf(arr[j]))) {
                count += 1;
            }
        }


        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.next();
        double n = scan.nextDouble();

        System.out.println(string(s, n));
    }
}
