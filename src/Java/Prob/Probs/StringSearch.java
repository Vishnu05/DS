package Java.Prob.Probs;

public class StringSearch {

    static void Find(char arr[], char[] arr1, int l, int m) {


        int i = 0, j = 0;

        for (j = 0; j < m; j++) {
            boolean temp = false;
            for (i = l - 1; i > 0; i--) {
                if(arr1[j]==arr[i]){
                    System.out.print(arr1[i]);
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {
        String a = "javatpoint";
        char arr[] = a.toCharArray();
        String toFind = "vat";
        char arr1[] = toFind.toCharArray();
        int l1 = a.length(), l2 = toFind.length();
        System.out.println();Find(arr, arr1, l1, l2);
    }
}
