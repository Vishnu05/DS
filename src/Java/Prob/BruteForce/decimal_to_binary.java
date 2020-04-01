package Java.Prob.BruteForce;

import java.util.Scanner;

public class decimal_to_binary {

    protected static Scanner ob = new Scanner(System.in);

    public static void Binary(int n) {

        int arr[] = new int[1000];
        int i = 0;

        while (n > 0) {
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        int count = i, k = 0;
        for (int j = i - 1; j >= 0; j--) {
            //  System.out.print(arr[j] + " ");
            arr[k] = arr[j];
            k++;
        }
        i = 0;


        // consecutive number 1101 ans: 2
        int aq = 0;
        for (int j = i; i < count; i++) {
            if (arr[i] ==1) {
                aq += 1;
            }
        }
        System.out.println(aq);
    }

    public static void main(String[] args) {

        int n = ob.nextInt();
        Binary(n);

    }
}


//-----------------
/*        int a = ob.nextInt();

        int arr[] = new int[20];
        int temp = 0, temp1 = 0;
        int count = 0;
        temp1 = a % 2;
        System.out.print(temp1 + " ");
        for (int i = 0; i <= a; i++) {

            if (a > 0) {
                temp = a / 2;
                a = temp;
                temp1 = temp % 2;
//                arr[i] = temp1;
//                count += 1;
                System.out.print(temp1+" ");
            }
        }*/