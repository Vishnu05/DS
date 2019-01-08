package Java.Advanced.Collections.List.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedVSHash {

    public static void main(String args[]) {

        LinkedList ob = new LinkedList();

        ob.add("vishnu");
        ob.add(5);
        ob.add(6);
        ob.add(3);
        ob.add(8);
        ob.add(7);
        ob.add(4);

        System.out.println(ob);

        HashSet<Integer> obj=new HashSet();
        obj.add(5);
        obj.add(5);
        obj.add(6);
        obj.add(3);
        obj.add(8);
        obj.add(7);
        obj.add(4);

        System.out.println("The has set :");
        for(int  a: obj){
            System.out.println(a);
        }
    }
}
