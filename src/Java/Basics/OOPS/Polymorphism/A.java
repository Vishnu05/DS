package Java.Basics.OOPS.Polymorphism;

public class A {

    /* This is an example of compile time polymorphism */

     private A() {
        this(0);
        System.out.println("First constructor");
    }

    A(int x) {
        this(0, 0);
        System.out.println("Second constructor");
    }

    A(int x, int y) {
        System.out.println("Third constructor");
    }

    public static void main(String args[]) {

        A obj = new A();

    }
}
