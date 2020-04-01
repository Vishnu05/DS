package Java.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatches {

    public static void main(String[] args) {

        String s = "dfd1";

        if(s.matches("[0-9]+")){
            System.out.println("Numbers are there");
        } else {
            System.out.println("NO numbers are there in given string");
        }

         Pattern pattern = Pattern.compile("[!@#$%^&*()-+]");
         Matcher m = pattern.matcher("Za1!");

        if(m.find()) {
            System.out.println("Working");
        }else{
            System.out.println("Not yet");
        }
    }
}
