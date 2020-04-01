package Java.Advn.Thread;

public class Sync {

    synchronized void th() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 :" + i);
        }
    }

    synchronized void th1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 :" + i);
            try {
               // Thread.sleep(10000);
            } catch (Exception e) {

            }
        }
    }

    void th2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 3 :" + i);
        }
    }

    void th3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 4 :" + i);
        }
    }

    public static void main(String args[]) throws Exception {

        Sync ob = new Sync();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                ob.th();
                ob.th2();
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ob.th1();

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                ob.th3();
            }
        });

        t.start();
        t1.start();
        t2.start();

        t.join();
        t1.join();
        t2.join();
    }
}
