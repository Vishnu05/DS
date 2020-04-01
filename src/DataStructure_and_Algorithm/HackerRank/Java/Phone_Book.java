package Java.HackerRank.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone_Book {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            int p = scan.nextInt();
            String s = scan.nextLine().trim();

            map.put(s, p);
        }

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine().trim();

        for(Map.Entry<String, Integer> it : map.entrySet()) {
                if(it.getKey().equals(s)) {
                    System.out.println(it.getKey()+"="+it.getValue());
                }
        }


       }
    }
}
