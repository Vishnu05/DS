package DataStructure_and_Algorithm.Sorting.MergeSort;

public class MergeSort {


    static void printMethod(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // printMethod(arr); Assertion error
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 7, 3};
        int len;
        printMethod(arr);
    }
}

