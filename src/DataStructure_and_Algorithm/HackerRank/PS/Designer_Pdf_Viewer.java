package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Designer_Pdf_Viewer {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = "abcdefghijklmnopqrstuvwxyz";
        char ar[] = s.toCharArray();

        int arr[] = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        String ss = scan.next();
        char ar1[] = ss.toCharArray();
        int arr1[] = new int[ar1.length];

        for (int j = 0; j < ar1.length; j++) {
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == ar1[j]) {
                    break;
                } else {
                    count++;
                }
            }

            arr1[j] = arr[count];
        }

        int m = 0;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[m] < arr1[i]) {
                m = i;
            }
        }
        int result = arr1.length * arr1[m];

        System.out.println(result);
    }
}
