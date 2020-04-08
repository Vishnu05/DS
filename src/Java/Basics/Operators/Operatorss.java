package Java.Basics.Operators;

public class Operatorss {

    int ball;
    int a = 5, b = 5;


    void check() {
        if (a < b) {
            System.out.println("IDK");
        }
        a += b;

        System.out.println(a);
    }

    void ternary() {
        a = 10;
        b = (a == 10) ? 12 : 13;
        System.out.println(b);
    }

    public static void main(String args[]) {

        Operatorss ob = new Operatorss();
        ob.check();
        ob.ternary();
    }
}
