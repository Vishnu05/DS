package DataStructure_and_Algorithm.HackerRank.Days_30;

import java.util.*;
import java.io.*;

public class loo2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int temp = 0, k = 1, foo = 0;
            temp=a+(b*k);
            for (int j = 0; j < n; j++) {
                temp=temp+(b*k);
                System.out.print(temp-b+" ");
                b+=b;
            }
            System.out.println();
        }
        in.close();
    }
}
