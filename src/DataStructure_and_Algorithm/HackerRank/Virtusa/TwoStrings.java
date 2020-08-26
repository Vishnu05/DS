package DataStructure_and_Algorithm.HackerRank.Virtusa;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * to check the substring of two string whether it is present or not
 */

public class TwoStrings {

    public static boolean checkString(String str1, String str2) {

        LinkedHashSet<Character> hs1 = new LinkedHashSet<>();
        LinkedHashSet<Character> hs2 = new LinkedHashSet<>();

        char arr[] = str1.toCharArray();
        char arr1[] = str2.toCharArray();
        boolean value = false;
        for (int i = 0; i < arr.length; i++) {
            hs1.add(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            hs2.add((arr1[i]));
        }

        Object[] arr3 = hs1.toArray();
        Object[] arr4 = hs2.toArray();
        LinkedHashMap<Integer, Character> lhm = new LinkedHashMap<>();


        for (int i = 0; i < arr3.length; i++) {
            lhm.put(i, (Character) arr3[i]);
        }

        /** I'm not understanding how retain all works **/
        System.out.println("before retain all : " + hs1);
        hs1.retainAll(hs2);
        System.out.println("after retain all : " + hs1);

        boolean va = hs1.retainAll(hs2);
        System.out.println("the boolean value of hashset : " + va);

        for (int i = 0; i < arr4.length; i++) {
            if (lhm.containsValue(arr4[i])) {
                value = true;
            }
            ;
        }

        return value;

    }

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

        int p = in.nextInt();

        for (int i = 0; i < p; i++) {
            String str1 = in.next();
            String str2 = in.next();

            if (checkString(str1, str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }

    }
}
