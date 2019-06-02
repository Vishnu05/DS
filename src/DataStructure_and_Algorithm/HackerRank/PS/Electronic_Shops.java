package DataStructure_and_Algorithm.HackerRank.PS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Electronic_Shops {


    static void shops(int b, int n[], int[] m) {

//        int t = 0;
//        t = m.length * n.length;
//        int k = 0;
//        int temp[] = new int[t];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {

            for (int j = 0; j < m.length; j++) {

                if (b >= n[i] + m[j]) {
                    list.add(n[i] + m[j]);
                }
            }
        }
        Collections.sort(list);
        int te =   list.size() - 1;
        if (list.size() > 0) {

        }

//        System.out.println(list.get(te));
//        int j = 0;
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] < b) {
//                if (temp[j] < temp[i]) {
//                    j = i;
//                }
//            }
//        }
//        Arrays.sort(temp);
//        j = temp.length - 1;
//        System.out.println(Arrays.toString(temp));
//        if (temp[j] <= b && temp[j] > 0 ) {
//            return temp[j];
//        } else {
//            return -1;
//        }
        if (list.size() > 0 ) {
            if (list.get(te) <= b && list.get(te) > 0) {
                System.out.println(list.get(te));
            }
        } else {
            System.out.println(-1);
        }
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int b = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int key[] = new int[n];
        int dri[] = new int[m];

        for (int i = 0; i < key.length; i++) {
            key[i] = scan.nextInt();
        }


        for (int i = 0; i < dri.length; i++) {
            dri[i] = scan.nextInt();
        }
       // System.out.println();
        shops(b, key, dri);

    }
}
