package Java.Basics.Operators;

public class Operators {

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

        Operators ob = new Operators();
        ob.check();
        ob.ternary();
    }
}
