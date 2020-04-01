package Java.Basics.Learning;

import java.util.Arrays;

public class ArraysRestarting {

    /*This is how we can restart the array from the starting position */
    public static void main(String args[]) {

        int[] a = {1, 3, 5, 6, 19};
        int start = 3;
        int initial = 0;

        for (int i = 0; i <= a.length; i++) {

            if (initial < a.length) {
                System.out.println(a[initial]);
                /*summing up the arrays else we are resetting the array to initial position*/
                initial += start;
            } else {
                initial = 1;
            }
        }

        int[] arr = new int[100];
        arr[1] = 3;
        arr[24] = 34;
        arr[45] = 68;
        arr[99] = 100;

        /*For 'js' browsers are more mature if it is empty it doesn't show up empty 100 values instead it shows only the values which are present*/
        System.out.println(Arrays.toString(arr));

    }
}
