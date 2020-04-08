package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class List_JavaLibraryBased {

    public static void main(String[] args) {

        /*If not using generic it will be set to objects, where Object is parent of dataTypes and everything
         * for restrict using different types we can use Generics */
        List list = new ArrayList();
        list.add(1);
        list.add("String");
        list.add(true);
        list.add(12.23d);
        list.add('c');
        list.add(1);
        System.out.println(list);


        list.forEach((e -> System.out.println(e)));

        for (Object ii : list) {
            System.out.print(ii + " ");
        }

        List list1 = new LinkedList();
        list1 = new ArrayList();
        list1 = new Vector();
        list1.add("hi");
        System.out.println("Interface objects : " + list1);


    }
}
