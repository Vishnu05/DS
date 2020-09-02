package PS.HackerRank.RecruitmentTest;

import java.util.Scanner;

public class index {

    /*This problem was asked in cisco for initial test and I failed to solve this at the end of test I got initial idea
     * and able to solve
     * There is a string and its need to be shifted to left-side and right-side
     * my initial approach is start from the left shifting complete the loop and start from the starting of loop not all test
     * cases were tested*/

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String s = in.next();
        int left_shifting = in.nextInt();
        int right_shifting = in.nextInt();

        char arr[] = s.toCharArray();

        char temp[] = new char[arr.length];
        char temp1[] = new char[temp.length];


        for (int i = 0; i < arr.length; i++) {

            /*Starting the array with the position to start */
            temp[i] = arr[left_shifting];
            if (left_shifting < arr.length - 1) {
                left_shifting++;
            } else {
                left_shifting = 0;
            }

        }
        System.out.println(temp);




        for (int k = 0; k < temp.length; k++) {

            temp1[k] = temp[right_shifting];
            if (right_shifting < temp.length - 1) {
                right_shifting++;
            } else {
                right_shifting = 0;
            }

        }

        System.out.println(temp1);

    }
}
