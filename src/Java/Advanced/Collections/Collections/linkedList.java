package Java.Advanced.Collections.Collections;

public class linkedList {

    Node head;
    Node headOne;

    static class Node {

        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        linkedList ob = new linkedList();
        ob.head = new Node(1);
        ob.head = new Node(890);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node fifth = new Node(5);

        ob.head.next = second;
        second.next = third;
        third.next = fifth;
        fifth.next = four;

        ob.printList();


    }
}
