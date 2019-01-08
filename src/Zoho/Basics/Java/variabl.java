package Zoho.Basics.Java;

import java.util.Date;


public class variabl {

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

        variabl ob=new variabl();
        //ob.days(12);
        ob.dayscount("Monday");
        ob.printfstatement();
    }
}
