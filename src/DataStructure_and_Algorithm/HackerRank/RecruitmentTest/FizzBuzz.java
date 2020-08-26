package DataStructure_and_Algorithm.HackerRank.RecruitmentTest;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String argsp[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }

        }
    }
}

