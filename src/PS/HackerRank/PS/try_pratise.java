package PS.HackerRank.PS;

import java.util.ArrayList;
import java.util.Scanner;

public class try_pratise {

    static public int solve(int A, int B, ArrayList<Integer> C) {

        C.add(0, B);
        Object arr[] = C.toArray();
        int ar[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ar[i] = (int) arr[i];
        }
        int temp = 0;
        int j = 0;

        for (int i = 0; i < ar.length; i++) {
            if ( C.get(j) != 0) {
                temp = j;
                j++;

            } else {
                j--;
                //C.remove(j);
                j++;
                j++;
            }
        }
        return ar[temp];

    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int b = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> c = new ArrayList<>();

        for (int i : arr) {
              c.add(i);
        }
        System.out.println(solve(n, b, c));


    }
}
