package Java.HackerRank.Day_10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mean_Median_Mode {

    static void mode(int arr[], int n) {

        double mean = 0;

        for (int i = 0; i < n; i++) {
            mean += arr[i];
        }
        mean = mean / n;
        DecimalFormat df = new DecimalFormat(".#");
        System.out.println(df.format(mean));

        int mean1 = n;
        mean1 = mean1 / 2;

        Arrays.sort(arr);

        mean1 = arr[mean1] + arr[mean1 - 1];
        //System.out.println(mean1);
        double mea = (double)mean1 / 2;
        System.out.println(mea);

        /* This stage confuse and nowhere to find the solution*/
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[j]) {
                j = i;
            }
        }

        Set set = new HashSet(Arrays.asList(arr));
        System.out.println(set.size());

        System.out.println(arr[j]);
    }



    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        mode(arr, n);
    }
}
