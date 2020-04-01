package Java.Advn.Thread;

public class ThreadName extends Thread {

    public void run() {

        System.out.println(Thread.currentThread());
        System.out.println(currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadName ob = new ThreadName();
        ThreadName ob1 = new ThreadName();

        Thread t = Thread.currentThread();
//      t.setName("I'm superclass");
//      System.out.println(t);
        ob1.setName("java threads");
        ob1.setPriority(MIN_PRIORITY);
        ob.setPriority(MAX_PRIORITY);
        ob.start();
        ob1.start();


    }
}
