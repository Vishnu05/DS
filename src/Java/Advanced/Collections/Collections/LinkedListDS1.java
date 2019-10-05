package Java.Advanced.Collections.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDS1 {

    Node obj;
    Node head;
    int ab = 12;
     static class Node {
        int a = 21;
    }
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add("String");
        list.add(true);
        list.add(1.22f);

     //   list.head = new Node();
        Iterator i = list.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
