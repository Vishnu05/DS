package PS.HackerRank.PS;

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

        //System.out.println(ls);

        int count1 = 0;
        Iterator ii = ls.iterator();
        char cc = ' ';
        char [] ar1 = new char[ls.size()];


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
               count1++;
            }
            if (count % 2 != 0) {
                ar1[k] = cc;
            }
            k++;
        }

        String res = String.valueOf(ar1);
        res = res.replaceAll("\\s","");

        if (count1 == ls.size()) {
            System.out.println("Empty String");
        } else {
            System.out.println(res);
        }
    }
}
