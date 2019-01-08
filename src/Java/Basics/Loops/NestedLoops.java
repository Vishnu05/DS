package Java.Basics.Loops;

public class NestedLoops {


    private static void nested(int n) {
        int sum;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n; j++) {

                for (int k = 1; k < n; k++) {

                    sum = i + j;
                    i++;
                    j++;
                    k++;
                    System.out.println("The values are : "+sum);
                }
            }
        }
    }

    public static void main(String args[]) {

        // int sum;
        nested(5);
    }
}
