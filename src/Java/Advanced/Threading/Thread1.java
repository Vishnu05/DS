package Java.Advanced.Threading;

import java.lang.Thread;

/* Why do we need threading ? Process vs Thread */


public class Thread1 extends Thread {

        public static void main(String args[]){


            Thread1 ob=new Thread1();
            System.out.println(ob.currentThread());

            ob.setName("Vishnu");
            System.out.println(ob.currentThread()+" "+ob.isAlive());
            ob.setName("java ");
            System.out.println(ob.getName());

        }

}
