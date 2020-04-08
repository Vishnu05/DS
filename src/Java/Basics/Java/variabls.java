package Java.Basics.Java;

import java.util.Date;


public class variabls {

    Date day;
    String time;
    int count;

    public void days(Date time) {
        day = time;

    }

     void mean(){

    }

    public void dayscount(String day) {

        this.time = day;
    }

    public String printfstatement() {

        System.out.println("The day is "+time);
        System.out.println("The time is "+day);
        //return printfstatement();
        return "no";
    }
    public static void main(String args[]){

        variabls ob=new variabls();
        //ob.days(12);
        ob.dayscount("Monday");
        ob.printfstatement();
    }
}
