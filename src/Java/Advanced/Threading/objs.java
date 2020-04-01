package Java.Advn.Thread;

public class objs extends Thread {

    public void run() {

        int j = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("j : " + "" + " " + i);
        }
        j++;
    }

    public static void main(String[] args) throws Exception {

        objs ob = new objs();
        objs obj=new objs();

        //shutdown hook
        Runtime oba=Runtime.getRuntime();
        System.out.println(oba.availableProcessors());

        ob.start();
      //  ob.join();
        obj.start();

    }
}
