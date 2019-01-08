package DataStructure_and_Algorithm.Problems;

public class Duplicate {

    public static void main(String args[]) {

        int arr1[] = {1, 4, 5, 6, 43, 234};
        int arr2[] = {4, 5, 6};

        System.out.print("Duplicate Number is : ");
        for (int i = 0; i < arr1.length; i++) {

            boolean a = true;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    a = false;
                }
            }
            if (a) {
                System.out.print(" " + arr1[i]);
            }
        }
    }
}
