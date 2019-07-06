package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Find_Digits {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();

            String s = String.valueOf(d);
            String ss[] = s.split("");

            int count = 0;
            int div = 0;
            for(int j = 0; j < ss.length; j++) {

                div = Integer.parseInt(ss[j]);

                try {
                    if (d % div == 0) {
                        count++;
                    }
                } catch (Exception e) {

                }
            }

            System.out.println(count);
        }
    }
}
