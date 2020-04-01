package Java.Advn.Thread;

public class Sleep extends Thread {

    void sleeps() throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.println("Hey Thread wait a sec : "+i);
            Thread.sleep(1000);
        }
    }

    public static void main(String arg[]) throws Exception{

        Sleep obj = new Sleep();
        obj.sleeps();
    }

}
