package DataStructure_and_Algorithm.HackerRank.Virtusa;

import java.util.Scanner;
import java.util.HashSet;

public class AlternatingCharacters {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        char a = 'A';
        char b = 'B';
        for (int i = 0; i < q; i++) {
            char[] arr = in.next().toCharArray();

            HashSet<Character> hs = new HashSet<>();

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (!hs.contains(arr[j])) {
                    hs.add(arr[j]);
                } else {

                 /*   if (hs.size() == 2) {
                        hs.removeAll(hs);
                        continue;
                    }*/
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
