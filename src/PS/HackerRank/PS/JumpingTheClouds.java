package Java.HackerRank.PS.Alg;

import java.util.Scanner;

public class JumpingTheClouds {

  /*  static int cloud(int n, int k, int[] ar, int e) {

        int a0 = 1;
        int a1 = 2;
        int count = 0;
        int counts = 0;

        *//*Brute force approach as always*//*

        for (int i = count; i < n; ) {

            if (ar[i] == 0) {
                e = e - a0;
            } else if (ar[i] == 1) {
                e = e - a1;
            }

            counts += ((i + k) % n );

            count += k;
            i = count;
        }

        System.out.println("using given formula: " + counts);
        *//*this is for starting point *//*
        if (ar[0] == 0) {
            e = e - a0;
        } else if (ar[0] == 1) {
            e = e - a1;
        }


        return e;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        int e = 100;

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(cloud(n, k, arr, e));
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int tc = 0;
        for (int i = 0; i < n; i++)
            tc += (in.nextInt() == 1 && i % k == 0) ? 1 : 0;
        System.out.print(100 - (n / k + tc * 2));
    }

}
