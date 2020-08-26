package DataStructure_and_Algorithm.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int ar[], int val) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == val) {
                ar[i] = -10;
            }
        }
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != -10) {
                count++;
            }
        }

       int[] ar1 = ar;
        ar = new int[count];
        int j = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != -10) {
                ar[j] = ar1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ar));

        return count;
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int val = in.nextInt();

        System.out.println(removeElement(ar, val));
    }
}
