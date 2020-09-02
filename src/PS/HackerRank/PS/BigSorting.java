package PS.HackerRank.PS;


import java.util.Scanner;

public class BigSorting {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        String [] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }

        for (int i = 0; i < n; i++) {

            int res = i;
            for (int j = 1 + i; j < n; j++) {
                 if (Double.parseDouble(s[res]) > Double.parseDouble(s[j]) ) {
                      res = j;
                 }
            }

            String ss = s[res];
            s[res] = s[i]; // swapping the number
            s[i] = ss;
            System.out.println(s[i]);

        }

    }
}
