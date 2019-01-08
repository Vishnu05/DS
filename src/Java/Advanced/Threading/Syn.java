package Java.Advanced.Threading;

/* After implements runnable interface the run method has to declared in public*/
public class Syn implements Runnable {

    static int a, b, c;
    static String id = "", name = "";

   synchronized   public void run() {
        a = -2;
        c = -1;
        if (a < c) {

            for (int i = 0; i < 5; i++) {
                System.out.println(""+i);
                try {
                    //Thread.sleep(1); // ?? uncomment and see o/p
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String args[]) {

        Syn ob = new Syn();
        Thread t = new Thread(ob);
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);

        t.start();
        t1.start();
        t2.start();

    }
}
