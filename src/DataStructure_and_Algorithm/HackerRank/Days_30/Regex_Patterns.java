package Java.HackerRank.$30Day;

import java.util.Scanner;

public class Regex_Patterns {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n;// = scan.nextInt();
        n = 6;
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }

        for (int i = 0; i < n; i++) {
            //  System.out.println(arr[i] + " " + i);
            arr = (arr[i].split(" "));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + i);
            //    arr[i].split("/(@gmail.com)/");
        }

    }
}
