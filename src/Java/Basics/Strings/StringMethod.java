package Java.Basics.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringMethod {

    public static void main(String args[]) throws Exception {

        final String h = ("hey "
                + "this is " +
                "vishnu" +
                "thamizharasan"
        );
        System.out.println(h);
        // h="sucks";
        System.out.println(h);

        String var = "Let use charAt method";
        // this is like array we can get a char by telling the index of string
        char s = var.charAt(1);
        System.out.println(s);

        //
        Scanner onj=new Scanner(System.in);
        String ss=onj.nextLine();
       // System.out.println("String :"+ss);
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String sg=ob.readLine();
        System.out.println("String I/O :"+sg);
    }
}
