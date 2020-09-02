package PS.HackerRank.Java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {


    static boolean isAnagram(String a, String b) {

        char arr[] = a.toCharArray();
        char arr1[] = b.toCharArray();
        int i = 0;
        for (i = 0; i < a.length(); i++) {
            arr[i] = Character.toUpperCase(arr[i]);
        }

        for (i = 0; i < b.length(); i++) {
            arr1[i] = Character.toUpperCase(arr1[i]);
        }

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr, arr1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

