package Java.Basics.Learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda extends Thread {

    public static void main(String[] args) {

        Thread obj = new Thread(() -> System.out.println("Hey hi"));

        obj.start();

        Thread ob = new Thread(new Runnable() {

            public void run() {

                try {
                    Thread.sleep(5000);
                    System.out.println("Sleep well");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        ob.start();

        List<Integer> li = Arrays.asList(1, 2, 3);

        System.out.println(li.size());

        for (int a : li) {
            System.out.print(a + " ");
        }
        System.out.println();

        //internal iterator
        li.forEach(value -> System.out.println(value));
        li.forEach(System.out::println);
        li.stream();


    }
}
