package Java.Basics.Strings;

import java.util.Scanner;

public class Stringlength {

    public static void main(String[] args) {

        String length_check = "String is a object in java (kinda) it can have anything ";
        String var = "var";
        int calc = length_check.length();
        // int calculate the length of the string
        int cal = var.length();
        System.out.println("The length of the string is : " + calc + " the var is : " + cal);

        // user give the string to calculate the length
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the String to calculate the length : ");
        String var2 = var1.next();
        int var3 = var2.length();
        System.out.println("The given string length is : " + var3);

        // This is string concatatination , append
        String con, con1;
        con = "vishnu";
        con1 = "thamizharasan";
        System.out.println(con.concat(con1));
    }
}
