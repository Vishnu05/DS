package Java.Java_Libary;

public class type_casting {

    public static void main(String[] args) {

        /* Widening or narrowing
         * Widening is implicit conversion of variables one type to another lower to higher order
         * Narrowing is explicit conversion where higher order to lower order */

        double a = -89.43535f;
        int sa = (int) Math.round(a); //type casting
        System.out.println(a);
        float o = 324.34f;
        int oo = (int) o; //casting explicit narrowing
        System.out.println(oo);
        double dd = o; //conversion implicit widening

        int dou = 5;
        double dou1 = Double.valueOf(dou);

        System.out.println(dou1);

        String ss = "This is a string";
        Object ob = ss;
        String ss1 = (String) ob;
        String ss2 = String.valueOf(ob);
        System.out.println(ss + " " + ss2);

    }
}
