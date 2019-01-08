package Basics;

import java.util.Scanner;

public class Pattern_Design
{

    public static void main(String args[]){

        System.out.println("Pattern Designs");
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();

        for (int i=0;i<n;i++){

            for(int j=0;j<=i;j++){

                System.out.print(j);
            }

            System.out.println();
        }

    }
}
