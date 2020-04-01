package Java.Advn.Thread;


public class Daemon extends Thread {


    public void run() {
        while (true) {
            System.out.println("Exception ");
            System.out.println("is Not Handled ");
            System.out.println("Rise ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println();
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {

        if (Thread.currentThread().isDaemon()) {
            System.out.println(" JVM");
        }

        //java.daemon.thread
        System.out.println(Thread.currentThread().getName());
        Daemon obj=new Daemon();
        System.out.println(obj.getName());
        obj.setName("Tony");
        System.out.println(obj.getName()+" "+Thread.currentThread()+" "+Thread.currentThread().getName());

        //java.Thread.daemon
        Thread ob=Thread.currentThread();
        System.out.println(ob);
        ob.setName("Stark");
        System.out.println(ob+""+Thread.currentThread().getName());

    }

}
