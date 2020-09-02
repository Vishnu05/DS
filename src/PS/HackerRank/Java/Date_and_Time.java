package Java.HackerRank.Java;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Date_and_Time {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2019, 07, 19);
//        cal.s
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        Scanner scan = new Scanner(System.in);
        int mm = scan.nextInt();
        int dd = scan.nextInt();
        int yy = scan.nextInt();
        LocalDate date = LocalDate.of(yy,mm, dd);
        String ss = String.valueOf(date.getDayOfWeek());
    }
}
