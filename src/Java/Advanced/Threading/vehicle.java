package Java.Advanced.Threading;

public class vehicle extends Thread {

    synchronized public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("WTF :" + i);
        }
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        vehicle ob=new vehicle();
        car ob1=new car();
        car ob2=new car();
        ob.start();
        ob1.start();
        //ob2.start();
    }
}

class car extends Thread {

    synchronized public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("WTF 1 :" + i);
        }
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
