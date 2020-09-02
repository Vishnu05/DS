package PS.HackerRank.PS;

import java.util.Scanner;

 /* This solution is copied from the discussion I'm not able to understand the question*/
public class JumpingOnTheClouds {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {

        int n = in.nextInt();
        int ar[] = new int[n];
        int count = -1;

        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        /*I have no idea what the heck is going on here*/
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && ar[i + 2] == 0)
                i++;
        }

        System.out.println(count);
    }
}
