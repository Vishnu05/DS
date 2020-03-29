package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.HashMap;

public class RansomNoteMagazine {

    /*TechLead interview problems suggestions*/
    /*removing the string from the magazine brute force approach would be checking all the string and removing the character
     * by one by one   */
    public static void main(String args[]) {

        String remove = "aabc";
        String magazine = "aaabbccde";

        char ar[] = remove.toCharArray();
        char ar1[] = magazine.toCharArray();

        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; i < ar1.length; j++) {

                if (ar[i] == ar1[j]) {
                    ar1[j] = ' ';
                    break;
                }
            }
        }
        System.out.println(ar1);

        /*Efficient way is doing by hashMap*/

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < ar1.length; i++) {
//            if (hm.containsKey())
        }

    }
}
