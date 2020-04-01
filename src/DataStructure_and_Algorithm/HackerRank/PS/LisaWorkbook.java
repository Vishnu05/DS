package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class LisaWorkbook {

    /*Again brute force approach it can be resolved by o(n) time complexity*/
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();
        int k = in.nextInt();
        int count = 1;
        int count1 = 1;
        int temp = 0;


        for (int i = 0; i < n; i++) {

            float arr = in.nextFloat();

            /*Rounding up the value to next integer so we will get a whole number and easy to stop the loop count
            * No idea about Math.ceil(double) */
            double local = Math.ceil(arr / k);
            int foo = (int) local;

            for (int j = 1; j <= foo; j++) {

                for (int m = 1; m <= k; m++) {

                    /*Checking whether the page count and problem count are similar*/
                    if (count == count1) {
                        temp++;
                    }

                    /*If problem count reaches the limit of page count it breaks */
                    if (count1 == (int) arr) {
                        break;
                    }

                    /*this is for problem count */
                    count1++;
                }

                /*this is for page count*/
                count++;
            }
            count1 = 1;

        }
        System.out.println(temp);
    }
}
