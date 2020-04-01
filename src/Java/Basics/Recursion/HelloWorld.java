package Java.Basics.Recursion;

public class HelloWorld {


    public static int world(String s) {

        int i = 0;
        if (i < 5) {
            return 1;
        } else {
            i++;
            System.out.println(s);
            return world(s);
        }
    }

    public static void main(String[] args) {

        String s = "hello world";
        System.out.println(world(s));

    }
}
