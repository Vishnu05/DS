package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Permutation_Equation {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int j = 1;


        for (int i = 0; i < n; i++) {
            int count = 0;
            int temp = 0;

            for (int k = 0; k < n; k++) {
                if (j == arr[k]) {
                    count = k;
                    break;
                }
            }

            count = count + 1;

            for (int k = 0; k < n; k++) {
                if (count == arr[k]) {
                    temp = k;
                    break;
                }
            }

            System.out.println(temp + 1);
            j++;
        }


    }
}
