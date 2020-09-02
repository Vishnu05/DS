package Java.HackerRank.Java;

import java.util.Scanner;

public class Typecasting_mathLibary {

    public static void prob(double d, int a, int b) {
        double temp = 0, temp1 = 0, fin = 0;
        float ba = (int) Math.abs(a);
        float bb = Math.abs(b);
        temp = (d * (ba / 100));
        temp1 = (d * (bb / 100));
        fin = d + temp + temp1;
        //  System.out.println("Value :"+temp+" "+temp1);
        int c = (int) Math.round(fin);
        System.out.println(c);
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        double d = ob.nextDouble();
        int a = ob.nextInt();
        int b = ob.nextInt();
        prob(d, a, b);

    }
}
