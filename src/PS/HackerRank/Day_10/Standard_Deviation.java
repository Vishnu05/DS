package Java.HackerRank.$10day_challenge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Standard_Deviation {

    public static void deviation(double arr[], int n) {


        double count = 0;
        int m = (int)arr[n / 2];
        System.out.println(m);
        for (int i = 0; i < n; i++) {

            arr[i] = arr[i] - m;
            arr[i] *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            count += arr[i];
        }

        count = count / n;

        double res = Math.sqrt(count);
       // DecimalFormat df = new DecimalFormat(".#");
        //System.out.println(df.format(res));
        System.out.println(res);

    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        double arr[] = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        deviation(arr, n);
    }
}
