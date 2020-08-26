package DataStructure_and_Algorithm.HackerRank.Virtusa;

import java.util.Scanner;

public class AlternatingCharacters1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int p = in.nextInt();

        for (int i = 0; i < p; i++) {

            char arr[] = in.next().toCharArray();
            int len = arr.length - 1;
            int count = 0;
            for (int j = 0; j < len; j++) {

                if (arr[j] == arr[j + 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
