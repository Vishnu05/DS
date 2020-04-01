package Java.Prob.BruteForce;

import java.util.Scanner;

public class sumof {

    public static boolean find(int arr1[],int a) {

        boolean temp = false;
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i] + arr1[j] == a) {
                    temp = true;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 9};
        int arr1[] = {1, 2, 4, 4};

        Scanner obj = new Scanner(System.in);
        System.out.println("Sum :");
        int a=obj.nextInt();
        System.out.println(find(arr1,a));

    }
}
