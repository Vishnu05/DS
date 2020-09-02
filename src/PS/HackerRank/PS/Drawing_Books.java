package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class Drawing_Books {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();
        int p = in.nextInt();
        int count = 0;
        int temp = 1;
        int wtf = 0;
        for (int i = 1; i <= n; i++) {


            for (int j = temp; j < temp + 2; j++) {
                if (j == p) {
                    wtf = 1;
                    break;
                }
            }
            count++;
            temp += 2;
            if (wtf == 1) {
                break;
            }
        }


        /*reverse should be done */
        for (int i = 1; i <= n; i++) {


            for (int j = temp; j < temp + 2; j++) {
                if (j == p) {
                    wtf = 1;
                    break;
                }
            }
            count++;
            temp += 2;
            if (wtf == 1) {
                break;
            }
        }

        System.out.println(count);
    }
}
