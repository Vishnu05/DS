
package Java.Basics.Arrays;

import java.util.Scanner;

public class AddingArray {

    public static void main(String vishnu[]){

        Scanner var=new Scanner(System.in);
        System.out.println("Enter the element size : ");
        //intailizing the variable
        int n=var.nextInt();
        int a[]= new int[n];
        int temp=0;

        System.out.println("Inputs : ");
        for(int i=0;i<a.length;i++){
            a[i]=var.nextInt();
        }

        // the temp is get added while each loops is incremented to array value index
        for(int i=0;i<a.length;i++){
            temp=temp+a[i];
        }

        //finally
        System.out.println("Sum "+temp);
    }

}