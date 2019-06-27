package Java.Basics.Java;

import java.util.GregorianCalendar;

public class finalizes extends GregorianCalendar {

    public static void main(String arg[]){

        finalizes ob=new finalizes();
        System.out.println(ob.getTime());

        if(1 > 1) {
            System.out.println("condition passes");
        } else {
            System.out.println("condition fails and this is how it works");
        }
    }
}
