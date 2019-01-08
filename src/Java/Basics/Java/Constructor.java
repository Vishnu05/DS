package Java.Basics.Java;

import Java.Basics.Prob.Decimal;

public class Constructor {
    Constructor() {
        int a = 1, temp = 0, b = 2, c = 0;
        System.out.println(b + " " + a);
        for (int i = 0; i < 10; i++) {
            c = a + b;
            a = b;
            temp = c;
            b = temp;
            System.out.print(temp + " ");
        }
    }

    public static void main(String args[]) {

        new Constructor();

    }
}
