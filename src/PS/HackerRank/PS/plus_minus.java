package PS.HackerRank.PS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class plus_minus {

    static void plusMinus(int arr[]) {

        int n = arr.length;
        double a = 0;
        double b = 0;
        double c = 0;

        int i = 0;
        while (i < n) {

            if (arr[i] > 0) {
                a += 1;
            } else if (arr[i] < 0) {
                b += 1;
            } else {
                c += 1;
            }
            i++;
        }
        a = a / n;
        b = b / n;
        c = c / n;

        // rounding the values baeldung.com/java-round-decimal-number
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format(b));
        System.out.println(df.format(c));
        System.out.println(df.format(a));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        plusMinus(arr);
    }
}
