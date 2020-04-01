package Java.Basics.Learning;

import java.util.Scanner;

public class hasnext {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        for(int i=0;ob.hasNext()==true;i++){
            System.out.println(i +""+ob.hasNext());
        }
    }
}
