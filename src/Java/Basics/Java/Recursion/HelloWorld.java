package Java.Basics.Java.Recursion;

public class HelloWorld {

    static int world(int n){


        while (n > 5) {
            return 1;
        }
        n++;
        System.out.println("hello world in recursion");
        return world(n);
    }

    public static void main(String[] args) {

        int n = 0;
        world(n);

    }
}
