package DataStructure_and_Algorithm.Problems;


public class SubArray {

    static boolean sub(int[] a, int[] b, int n, int m) {

        boolean flag = true;
        int j = 0;
        int i = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (b[i] == a[j]) {
                    break;
                }
            }
            if (j == n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int arr[] = {9,3,10,2};
        int[] arr2 = {9, 3, 90};

        int n = arr.length;
        int m = arr2.length;

        if (sub(arr, arr2, n, m))
            System.out.println("Sub Array");
        else
            System.out.println("Not sub array");
    }
}

// time complexity o(n)2