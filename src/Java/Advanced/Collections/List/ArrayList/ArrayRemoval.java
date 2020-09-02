package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayRemoval {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);

        System.out.println("size of the list " + list.size());
        System.out.println("checking the element : " + list.get(0));

        /*
         this method will not workout if we try to get an element which the index does not exits
         for arrayReduction this doesn't help me gs hackerrank
         System.out.println("trying to get the element which doesn't exits : " + list.get(5));
        */

        List<Integer> link = new LinkedList<>();
        link.add(45);
        link.add(98);
        //System.out.println("Out of bounce exception excepted " + link.get(5));

        System.out.println("Thread active counts " + Thread.activeCount());
        int nbThreads =  Thread.getAllStackTraces().keySet().size();
        System.out.println("Total threads : " + nbThreads);

    }
}
