package Java.HackerRank.Java;

import java.util.HashMap;
import java.util.Scanner;

public class dictionaries_and_maps {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        HashMap<String, Integer> hm = new HashMap<>();


        for (int i = 0; i < n; i++) {

            String s = scan.next();
            int no = scan.nextInt();
            hm.put(s, no);
        }

        for (int i = 0; i < n; i++) {

            String s1 = scan.next();

            if (hm.containsKey(s1)) {
                System.out.println(s1 + "=" + hm.get(s1));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
