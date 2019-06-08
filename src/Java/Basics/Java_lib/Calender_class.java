package Java.Basics.Java_lib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_class {

    public static void main(String args[]) throws Exception {

        Calendar obj = Calendar.getInstance();
        String s = "08 05 2015";
        Date d = new SimpleDateFormat("dd-mm-yyyy").parse(s);
        System.out.println(d);
    }
}
