package Java.Advanced.Threading;

public class Lambda  {


    public static void main(String[] args) {

        Thread ob = new Thread(() -> System.out.println("hello world lambda"));
        System.out.println(ob);
    }

    //
}

abstract class express {

    abstract void mem();
}