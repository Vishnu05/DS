package Java.Advanced.Threading;

public class ThreadPriority extends Thread {

    public void run() {
        System.out.println("dead lock 1");
    }

    public static void main(String args[]) {

        ThreadPriority ob = new ThreadPriority();
        b obj = new b();
        obj.setPriority(10);
        ob.start();
        obj.start();
        System.out.println(ob.getPriority());

    }
}

class b extends Thread {

    public void run() {
        System.out.println("dead lock");
    }

}
