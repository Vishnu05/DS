package Java.Advn.Thread;

public class SynKey extends Thread {

    public void run() {

        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        SynKey ob=new SynKey();
        Thread t=new Thread(ob);
        Thread t1=new Thread(ob);

        t.start();
        t1.start();

    }
}
