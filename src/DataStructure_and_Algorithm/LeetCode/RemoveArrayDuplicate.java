package DataStructure_and_Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveArrayDuplicate {

    static int remove(int ar[]) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < ar.length; i++) {
            hs.add(ar[i]);
        }

        ar = new int[hs.size()];
        Iterator ii = hs.iterator();
        int j = 0;
        while(ii.hasNext()) {
            ar[j] = (int) ii.next();
            j++;
        }
        return ar.length;
    }

    /** public int removeDuplicates(int[] nums) {
     if (nums.length == 0) return 0;
     int i = 0;
     for (int j = 1; j < nums.length; j++) {
     if (nums[j] != nums[i]) {
     i++;
     nums[i] = nums[j];
     }
     }
     return i + 1;
     }*/

    static Scanner scan = new Scanner(System.in);

    public static void main(String arg[]) {

        int n = scan.nextInt();
        int ar [] = new int[n];

        for(int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        System.out.println(remove(ar));
    }
}
