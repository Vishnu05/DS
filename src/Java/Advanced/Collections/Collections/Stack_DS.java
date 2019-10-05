package Java.Advanced.Collections.Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack_DS {

    public static void main(String[] args) {
        /** A dataStructure LIFO type ex. undo and redo are concept of stack
         * Stack uses linked list, insertion and deletion operation are done by them*/

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(56);
        stack.push(87);
        stack.push(90);
        stack.push(132);
        stack.push(423);
        stack.push(526);
        stack.push(877);
        stack.push(312);
        stack.push(273);
        stack.push(560);
        stack.push(871);


        System.out.println(stack);

        /** Removing the latest element*/
        stack.pop();
        System.out.println(stack);

        /** Calculate the size */
        System.out.println("Stack size: " + stack.size());
        stack.push(5);

        /** Top element of the stack or recently added */
        System.out.println("Top of the stack : " + stack.peek());

        /** Number of element capable of holding
         * Capacity is increased by 10 each time I think
         */
        System.out.println("Stack Capacity : " + stack.capacity());

        Iterator i = stack.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        /** It returns the position of element */
        System.out.println("Searching : " + stack.search(12));
        stack.clear();
        System.out.println("After clear : " + stack);

        /** Without using generics */
        Stack s = new Stack();
        s.push("Three23");
        s.push(123);
        s.push('c');
        s.push(true);
        s.add(1, "stack use linked list");
        System.out.println(s);

    }
}
