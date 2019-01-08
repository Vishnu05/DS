package Java.Basics.OOPS.Polymorphism;

public class Over {

    static int a, b;

    static int method(int x, int y) {

        return x * y;
    }

    static int method(int a, float b) {

        return a;

    }

    static float method(float a, float b) {

        return a / b;
    }

    public static void main(String args[]) {

        System.out.println(method(2, 6));
        System.out.println(method(5, 6f));
        System.out.println(method(2f, 6f));

    }
}
