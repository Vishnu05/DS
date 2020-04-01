package Java.Advn.Thread;


public class callback_In_Java extends Thread {

    void runs() throws InterruptedException {
        System.out.println("first call 1");
        Thread.sleep(10000);
    }

    void runs1() {
        System.out.println("Second call 2");
    }

    public static void main(String[] args) throws InterruptedException {

        callback_In_Java obj = new callback_In_Java();
        obj.runs();
        obj.runs1();

    }
}
