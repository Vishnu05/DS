package DataStructure_and_Algorithm.HackerRank.Days_30;

import java.util.*;


public class static_initializer {

    static Scanner ob = new Scanner(System.in);
    static int B = ob.nextInt();
    static int H = ob.nextInt();
    static boolean flag = true;

    static {
        if (H > 0 && B > 0) {
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main

}//end of class
