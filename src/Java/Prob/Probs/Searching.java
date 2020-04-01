package Java.Prob.Probs;

public class Searching {

    static int search(int arr[], int n, int value) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (value == arr[i]) {
                return temp = arr[i];
            }
//            }else
//                return 0;
        }
        return 0;
    }


    public static void main(String arghs[]) {

        int arr[] = {2, 4, 5, 7, 10, 17, 18, 20};
        int n = arr.length;
        System.out.println("Search ended : " + search(arr, n, 10));
    }
}

// worst case o(n) algorithm
//average case o(n)
//best case o(1)