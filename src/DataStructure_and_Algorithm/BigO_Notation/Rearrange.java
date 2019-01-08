package DataStructure_and_Algorithm.BigO_Notation;

import java.util.Arrays;

public class Rearrange {

    static void rearrange(int n, int arr[]) {

        int temp[] = new int[n];

        int small = 0, large = n - 1;

        boolean flag = true;

        for (int i = 0; i < n; i++) {

            if (flag) {
                temp[i] = arr[large--];
                //System.out.println(temp[i]);
            } else {
                temp[i] = arr[small++];
            }
            flag = !flag;
        }
        arr=temp.clone();
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        rearrange(arr.length, arr);
        System.out.println("Rearranging the arrays");  // no idea
      //  System.out.println("---" + arr);
        System.out.println(Arrays.toString(arr));

    }
}
