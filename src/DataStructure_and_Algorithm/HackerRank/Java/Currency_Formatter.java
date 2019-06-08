package DataStructure_and_Algorithm.HackerRank.Java;

import java.text.NumberFormat;
import java.util.*;

public class Currency_Formatter {

    static void currency(String s, Locale locale, double d) {

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String ss = nf.format(d);
        System.out.println(s + " " + ss);
    }

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        double d = scan.nextDouble();
        Locale in = new Locale("en","IN");
        currency("US:", Locale.US, d);
        currency("India:", in, d);
        currency("China:", Locale.CHINA, d);
        currency("France:", Locale.FRANCE, d);

        scan.close();
    }
}
