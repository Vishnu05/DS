package Java.Basics.Prob;

public class rec {

    public static void main(String args[]) {

        something(3);
    }

    public static void something(int n) {

        if (n != 0) {
            something(n - 1);
        }
        System.out.println(n);
    }

}