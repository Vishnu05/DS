package PS.HackerRank.AthenaHealth;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();
        int leftShift = in.nextInt();
        int rightShift = in.nextInt();


        char arr[] = s.toCharArray();
        char newArray[] = new char[s.length()];


        int count = leftShift;
        for (int i = 0; i < s.length(); i++) {
            if (count < s.length()) {
                newArray[i] = arr[count];
                count++;
            } else{
                count = 0;
                newArray[i] = arr[count];
                count++;
            }

        }
        System.out.println(newArray);

        char rightArr[] = new char[s.length()];
        count = rightShift;
        for (int i = 0; i < s.length(); i++) {
            if (count < s.length()) {
                rightArr[i] = newArray[count];
                count++;
            } else{
                count = 0;
                rightArr[i] = newArray[count];
                count++;
            }

        }
        System.out.println(rightArr);


    }
}
