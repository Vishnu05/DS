package PS.Problems;

import java.util.Scanner;

public class Matrix {
    int i = 0, j = 0;

    public void input(int arr[][]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Input : ");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                arr[i][j] = ob.nextInt();
            }
        }
    }

    public void output(int arr[][]) {
        System.out.println("Output : ");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void oreo(){

        int temp=0;

    }

    public static void main(String[] args) {

        int arr[][] = new int[4][4];

        Matrix ob = new Matrix();
        ob.input(arr);
        ob.output(arr);

    }
}
