package Java.HackerRank.PS.Alg.Strings;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ReducedStrings {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.next();
        char ar[] = s.toCharArray();

        Set<Character> ls = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            ls.add(ar[i]);
        }

        System.out.println(ls);

//        int count = 0;
        Iterator ii = ls.iterator();
        char cc = ' ';
        char [] ar1 = new char[ls.size()];
        //   for (int i = 0; i < ls.size(); i++) {

        int k = 0;
        while (ii.hasNext()) {
            cc = (char) ii.next();
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (cc == ar[j]) {
                    count++;
                }
            }

            if (count % 2 == 0) {

            }
            if (count % 2 != 0) {
                ar1[k] = cc;
            }
            k++;
        }

        String res = ar1.toString();



    }
}
