package DataStructure_and_Algorithm.Problems;

public class Palindrome {

    static boolean mem(char a[], int n) {

        int i = 0, j = n - 1;
        boolean temp = true;
        for (i = 0; i < n / 2; i++) {
            if (a[i] != a[j]) {
                temp = false;
            }
            j--;
        }
        return temp;
    }

    public static void main(String args[]) {

        String name = "madam";
        int len = name.length();
        char arr[] = name.toCharArray();

        if (mem(arr, len)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
