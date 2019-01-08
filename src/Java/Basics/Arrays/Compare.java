package Java.Basics.Arrays;

import java.util.Arrays;

public class Compare {

    public static void main(String args[]) {

        int a[] = {1, 5, 6};
        int b[] = new int[]{1, 5, 6};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("The values are equal ");
                }
            }
        }

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal ");
        } else System.out.println("the given arrays are not equals");
    }
}
