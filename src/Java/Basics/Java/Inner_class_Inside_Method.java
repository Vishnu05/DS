package Java.Basics.Java;

public class Inner_class_Inside_Method {

    /*inside the method inner class*/
    void function() {

        class inner {

            int a = 1, b, c;

            void fun() {
                System.out.println("Inner class is :" + a + b);
            }
        }
        int a = 2, b = 4;
        System.out.println("Method :" + a + b);

        inner foo = new inner();
        foo.fun();
    }

    public static void main(String args[]) {

        boolean[] ob = new boolean[0];

        Inner_class_Inside_Method obj = new Inner_class_Inside_Method();
        obj.function();
    }
}
