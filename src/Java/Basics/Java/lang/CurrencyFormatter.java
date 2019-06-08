package Java.Basics.Java.lang;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencyFormatter {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        double d = scan.nextDouble();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
//        d = nf.parse()

        String s = "welcometojava";
        String [] ss = s.split("", 3);
        for (String i : ss ) {
            System.out.println(i);
        }

        String ws = "          Hello         how are            you       ";
        /** Trim only removes front and end white spaces it doesn't remove in between*/
        ws = ws.trim();
        System.out.println(ws);
        ws = ws.replaceAll("\\s+", " ");
        System.out.println(ws);
        SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
    }
}
