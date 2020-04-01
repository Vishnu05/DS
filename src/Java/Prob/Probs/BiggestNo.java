package Java.Prob.Probs;

public class BiggestNo {

    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 36, 8, 10, 1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[j] < arr[i]) {
                j = i;
            }
        }
        System.out.println(arr[j]);
    }
}
