package Java.Advanced.Collections.Collections;


import java.util.PriorityQueue;
import java.util.Queue;

public class Queues_PQ {

    public static void main(String[] args) {

        /** Queue is similar to stack but it uses FIFO operation */

        Queue<String> qw = new PriorityQueue<>();
        qw.add("FIFO");
        qw.add("Undo operation");
        qw.add("String ??");

        System.out.println(qw);
        System.out.println(qw.element());

        Queue<Object> qw1 = new PriorityQueue<>();
        qw1.add(13);
        qw1.add(78);
        System.out.println(qw1);
        qw1.poll(); /** This remove from the queue */
        System.out.println(qw1);
        qw1.add(97);
        qw1.add(24);
        qw1.remove(); /**It removes the last element added*/
        System.out.println(qw1);
        qw1.remove(97);
        System.out.println(qw1 + " :: " + qw.isEmpty());

    }
}
