package Java.Basics.Java;

import java.util.HashMap;

public class InnerClass {

    static class StaticClass {
        static public void method() {
            System.out.println("This is the static inner class inside method");
        }
    }

    public static void main(String[] args) {

        InnerClass.StaticClass sc = new InnerClass.StaticClass();
        sc.method();

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Vishnu");
        System.out.println(hm);
    }
}
