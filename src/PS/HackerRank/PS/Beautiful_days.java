package PS.HackerRank.PS;

import java.util.Scanner;

public class Beautiful_days {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int s = scan.nextInt();
        int e = scan.nextInt();
        int d = scan.nextInt();
        int a, b, reverse = 0;
        int count = 0;
        int st = s;

        for (int i = st; i < e; i++) {
            s = i;
            while (s > 0) {
                a = reverse * 10;
                b = s % 10;
                reverse = a + b;
                s = s / 10;
            }

            double temp = 0;
            temp = (i - reverse) / (double)d;

            if (temp == (int)temp) {
                count++;
            }
            reverse = 0;
        }
        System.out.println(count);
    }
}
