package Java.Basics.OOPS;


class base {

    boolean saturday;

    void display() {

        System.out.println("Today is " + saturday);
    }
}

public class Super extends base {

    void display1() {
        saturday = true;
        System.out.println("The day is " + saturday);
    }

    public static void main(String args[]) {

        Super ob = new Super();
        ob.display1();
        ob.display();
    }
}