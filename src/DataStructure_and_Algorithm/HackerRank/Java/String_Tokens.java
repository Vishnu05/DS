package DataStructure_and_Algorithm.HackerRank.Java;

import java.util.Scanner;

public class String_Tokens {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.nextLine();
        s = s.trim();
        s = s.replaceAll("\\s+", " ");

        String[] ss = s.split("[, ?.@'!_]+");

        int count = 0;
        for (String i : ss) {
            if(!i.equals("")) {
                count++;
            }
        }
        System.out.println(count);
        for (String i : ss) {
            System.out.println(i);
        }
    }
}
