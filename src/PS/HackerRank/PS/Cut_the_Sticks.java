package PS.HackerRank.PS;

import java.util.ArrayList;
import java.util.Scanner;

public class Cut_the_Sticks {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(scan.nextInt());
        }

        int count = 0;
        System.out.println(al.size());

        for (int i = 0; al.size() > 1; i++) {

            int min = 0;
            /*TO check the minimum value in array*/
            for (int j = 1; j < al.size(); j++) {
                if (al.get(min) > al.get(j)) {
                    min = j;
                }
            }
            count = 0;

            min = al.get(min);
            /* TO check and difference b/w  */
            for (int j = 0; j < al.size(); j++) {
                int temp = 0;
                if (min > 0) {
                    temp = al.get(j) - min;
                }

                if (temp > 0) {
                    al.set(j, temp);
                    count++;
                } else {
                    al.remove(j);
                    j--;
                }
            }
            if (count > 0) {
                System.out.println(count);
            }

        }

        // System.out.println(1);
    }
}
