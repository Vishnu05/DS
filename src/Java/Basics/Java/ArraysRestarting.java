package Java.Basics.Java;

public class ArraysRestarting {

    public static void main(String args[]) {

        int[] a = {1, 3, 5, 6, 19};
        int start = 3;
        int initial = 0;

        for (int i = 0; i <= a.length; i++) {

            if (initial < a.length) {
                System.out.println(a[initial]);
                initial += start;
            } else {
                initial = 1;
            }

        }
    }
}
