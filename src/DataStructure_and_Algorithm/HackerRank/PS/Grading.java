package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.Scanner;

public class Grading {

    static Scanner scan = new Scanner(System.in);

    static void grade(int arr[]) {


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int sum1 = 0;

            if (arr[i] % 5 < 3) {
                sum = (arr[i] % 5);
                System.out.println(arr[i] + sum);
            }else{
                System.out.println(arr[i]);
            }

//            if ((arr[i] > 37)) {
//                sum = (arr[i] + 2);
//                sum1 = (arr[i] + 1);
//                if (sum % 5 == 0) {
//                    System.out.println(sum);
//                } else if (sum1 % 5 == 0) {
//                    System.out.println(sum1);
//                } else {
//                    System.out.println(arr[i]);
//                }
//            } else {
//                System.out.println(arr[i]);
//            }
        }

        /* Refactored solution
         * if (arr(i) % 5 < 3 ) {
         * sum = (arr[i] % 5);
         * System.out.println(arr[i] + sum);
         * }*/

        //return arr;
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
//        System.out.println((grade(arr)));
        grade(arr);
    }
}
