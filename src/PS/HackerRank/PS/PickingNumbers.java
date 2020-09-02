package Java.HackerRank.PS.Alg;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PickingNumbers {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(ar[i]);
        }
        System.out.println(set);
    }
}
