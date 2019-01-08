package Java.Basics.OOPS.Abstraction;

class SingleTon {

    static SingleTon ob = new SingleTon();

    private SingleTon() { // since the con
    }

    static SingleTon method() {
        return ob;
    }
}

class a {
    public static void main(String[] args) {
        SingleTon obj = SingleTon.method();

    }
}