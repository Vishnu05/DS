package Java.Advanced.Threading;


class th extends Thread {

   public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 :" + i);
        }
    }
}

class th1 extends Thread {

      public synchronized void run() {
       for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 :" + i);
        }
      }
}

class th2 implements Runnable{

    public synchronized void run(){
        for (int i=0;i<10 ;i++){
            System.out.println("Thread 3 : "+i);
        }
    }
}

public class ex {

    public static void main(String args[]) {

        th o = new th();
        th1 o1 = new th1();
        th2 o2=new th2();
        Thread t=new Thread(o2);
        synchronized (o1) {
            o.start();
            o1.start();
            t.start();
        }
    }

}
