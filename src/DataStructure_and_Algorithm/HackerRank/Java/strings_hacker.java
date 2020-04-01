package Java.HackerRank.Java;

import java.util.Scanner;

public class strings_hacker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char arr[] = a.toCharArray();
        boolean foo = false;
        int j = a.length() - 1;
        for (int i = 0; i < a.length(); i++) {

            if (arr[i] == arr[j]) {
                foo = true;
            } else {
                foo = false;
            }
            j--;
        }

        if (foo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

/*StringBuffer obj = new StringBuffer(a);
        String c = "";
        obj = obj.reverse();
        c = obj.toString();

        if (a.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/
