package PS.HackerRank.PS;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswords {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        String s = scan.next();

        Pattern p = Pattern.compile("[!@#$%^&*()-+]");
        Matcher m = p.matcher(s);

        Pattern p1 = Pattern.compile("[a-z]");
        Matcher m1 = p1.matcher(s);
        Pattern p2 = Pattern.compile("[A-Z]");
        Matcher m2 = p2.matcher(s);
        Pattern p3 = Pattern.compile("[0-9]");
        Matcher m3 = p3.matcher(s);
        Pattern p4 = Pattern.compile("[-]");
        Matcher m4 = p4.matcher(s);


        char ar[] = s.toCharArray();
        int count = 0;
        if (ar.length > 0) {
            if (m.find()) {

            } else {
                count++;
            }
            if (m1.find()) {

            } else {
                count++;
            }
            if (m2.find()) {

            } else {
                count++;
            }
            if (m3.find()) {

            } else {
                count++;
            }
        }

        int counts = s.length() + count;

        if (counts > 6) {
            System.out.println(count);
        } else {
            System.out.println(Math.abs(s.length() - 6));
        }
        scan.close();
    }
}


