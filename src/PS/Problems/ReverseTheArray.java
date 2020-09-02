package PS.Problems;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {

        int ar[] = {1, 3, 4, 5, 6, 32, 52, 14};

        int ar1[] = new int[ar.length];
        int len = ar.length - 1;

        int j = 0;
        /** Traverse the array from end to start */
        for (int i = len; i >= 0; i--) {
            ar1[j] = ar[i];
            j++;
        }

        System.out.println(Arrays.toString(ar1));
    }
}
