package DataStructure_and_Algorithm.HackerRank.PS;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maximizing_xor {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int s = scan.nextInt();
        int e = scan.nextInt();

        int size = Math.abs(s - e);
        int k = 0;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = s; i <= e; i++) {
            int tm = s;
            for (int j = tm; j <= e; j++) {

                al.add(s ^ j);
                k++;
            }
        }


        k = 0;


        for (int i = k; i < al.size(); i++) {
            if (al.get(k) < al.get(i)) {
                k = i;
            }
        }

        System.out.println(al.get(k));
        System.out.println(al);
    }
}
