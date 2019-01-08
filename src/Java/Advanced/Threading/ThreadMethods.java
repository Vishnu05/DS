package Java.Advanced.Threading;

public class ThreadMethods extends Thread{


    public void run(){
        System.out.println("thread is starting");
    }

    public static void main(String args[]){

        ThreadMethods obj=new ThreadMethods();
        Thread t=new Thread();

        obj.start();



    }
}
