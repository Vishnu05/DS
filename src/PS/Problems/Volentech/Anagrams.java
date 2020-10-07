package PS.Problems.Volentech;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String s1 = "heart";
        String s2 = "earth";

        char arr[] = s1.toCharArray();
        char[] arr1 = s2.toCharArray();

        /** naive approach sorting the character and checking whether it is same word or not*/

        System.out.println("Before sorting " + s1 + s2);
        StringBuilder bf = new StringBuilder(s1);

        /** Arrays.sort method only work with Arrays*/
        Arrays.sort(arr);

        Arrays.sort(arr1);
      //  System.out.println("After sorting " + Arrays.toString(arr) + " : " + Arrays.toString(arr1));
        System.out.println("After sorting " + arr + " : " + arr1);
        System.out.println(arr);
        System.out.println(arr1);

        char a[] = {'1','2'};
        char b[] = {'1','2'};
        System.out.println(b == a);

        int count = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++ ) {
            if (arr[i] == arr1[i]) {
                count++;
            }
        }

        if (len == count) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a Anagram");
        }

        if(Arrays.equals(arr, arr1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(arr == arr1);
        if (arr == arr1) {
            System.out.println("Entered string is anagrams ");
        } else {
            System.out.println("Nope string seems to not an anagrams");
        }

    }
}
