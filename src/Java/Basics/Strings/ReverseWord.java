package Java.String;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String args[]) {

        /* brute force approach to reverse the given string */
        String reverse = "this is the string which gonna reverse the words";
        String arr[] = reverse.split(" ");

        for (int k = arr.length - 1; k > 0; k--) {
            System.out.print(arr[k] + " ");
        }

        int i = 2;

        boolean temp = true;
        Scanner ob = new Scanner(System.in);
        for (; temp; ) {  //dope for loop //lol

            /*If s is equal to or greater than 100 loop ends*/
            int s = ob.nextInt();

            if (s > 100) {
                temp = false;
            }
        }

    }
}
