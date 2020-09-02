package PS.HackerRank.Java;

import java.util.*;

public class min_max_sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp += arr[i];
        }
        System.out.print(temp);
        temp = 0;
        for (int i = 1; i < arr.length; i++) {
            temp += arr[i];
        }
        System.out.print(" " + temp);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

