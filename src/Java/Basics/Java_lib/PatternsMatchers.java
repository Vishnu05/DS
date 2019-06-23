package Java.Basics.Java_lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatchers {

    public static void main(String[] args) {

        String s = "AUzs-nV";
        Pattern p = Pattern.compile("[!@#$%^&*()+-]-");
        Matcher m = p.matcher(s);

        if(m.find()){
            System.out.println("ok");
        } else {
            System.out.println("nope");
        }
    }
}
