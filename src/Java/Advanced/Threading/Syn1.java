package Java.Advn.Thread;


public class Syn1 extends Thread {

    int count;

    synchronized int increment() {
       return count++;
        //System.out.println("Increment is working");
    }

    public void run() {
        System.out.println("Thread");
        for (int i = 0; i < 3000; i++) {
            increment();
        }
 
    }

    public static void main(String args[]) throws InterruptedException {

        Syn ob = new Syn();
        ob.start();
        //ob.increment();

        try {
          //  ob.join(); //join thread wait to die
        } catch (Exception e) {
            e.printStackTrace();
        }

      System.out.println("Count : " + ob.count);
    }
}