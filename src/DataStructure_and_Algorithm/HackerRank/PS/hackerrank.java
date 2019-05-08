package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class hackerrank {

    public static String sub(String s, String s1) {

        char[] arr = s.toCharArray();
        char[] arr1 = s1.toCharArray();
        String result = "Yes";

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr[i] != arr1[j]) {
                    result = "No";
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = "hackerrank";
        String s1 = "hereiamstackerrank";
        System.out.println(sub(s, s1));
    }
}
