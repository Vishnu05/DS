package Java.Basics.OOPS.Abstraction;

public interface Inter1 {

    abstract void notFun();

    public static void main(String[] args) {

        Inter1 obj = new Inter1() {

            public void notFun() {
                System.out.println("Interface");
            }
        };
        obj.notFun();

    }
}
