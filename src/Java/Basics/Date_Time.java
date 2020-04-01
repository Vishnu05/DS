package Java.Basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {

    public static void main(String[] args) {

        Date dt = null;
        String s = "10:13:13PM";
        String time = null;
        DateFormat ip = new SimpleDateFormat("hh:mm:ssaa"); // for 12 hours format
        DateFormat op = new SimpleDateFormat("HH:mm:ss"); // for 24 hours format

        try {
            dt = ip.parse(s);
            time = op.format(dt);
            System.out.println(time);
        } catch (Exception e) {

        }

    }
}
