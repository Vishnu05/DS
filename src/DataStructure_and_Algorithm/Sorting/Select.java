package DataStructure_and_Algorithm.Sorting;

import java.util.Scanner;

public class Select {
    public static void main(String args[]) {


/*        int a[][]=new int [3][3];
        Scanner var=new Scanner(System.in);
        System.out.println("Enter the two Dimensional array");
        System.out.println(a.length);
        for (int b=0;b<a.length;b++){
            a[b][b]=var.nextInt();
        }*/
        String[] arrays = {"vishnu", "back", "to", "game", "data", "Structures"};

        for (String array1 : arrays) {
            System.out.println(array1);
        }

        System.out.println(arrays.length);
        Scanner var = new Scanner(System.in);
        int arr[] = {1, 2, 5, 7};
        int b = var.nextInt();
        String a = var.next();

        for (int i = 0; i < arrays.length; i++) {
            //if (b[i] == arr) {
            System.out.println("Found");
            // }
            System.out.println("Loop");

        }


    }
}


