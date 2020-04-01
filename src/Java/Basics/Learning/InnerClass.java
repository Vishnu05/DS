package Java.Basics.Learning;

public class InnerClass {

    static class eg {

        void meth() {
            System.out.println("Inner Class example ");
        }
    }

    public static void main(String[] args) {

        InnerClass.eg obj = new eg();
        obj.meth();
        //eg1 on = new eg1();

    }

    class eg1 {

        eg1() {
            System.out.println("Constructor for non static inner class");
        }
    }
}
