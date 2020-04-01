package Java.Prob.Probs;

import java.util.Arrays;

public class Finding2largestInArray {

    public static void main(String[] args) {

        int arr[] = {2, 6, 1, 54, 13, 43};

        // brute force solution
        Arrays.sort(arr);
        int len = arr.length - 2;
        System.out.println(arr[len]);

        /* Traversing all the element in array find the second greatest element */

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        int first = 0, second = first;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) { second = first;
                first = arr[i];
            }

        }

        System.out.println(arr[second]);
    }
}
