package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Loop {

    public static void main(String[] args) {

        /*This class is used to iterate the values in collection in java
         * Maps cannot be used*/

        List list = new ArrayList();

        Iterator i = list.iterator();

        list.add(1);
        list.add("String");
        list.add(true);
        list.add(12.23d);
        list.add('c');

        while (i.hasNext()) {
            System.out.println("Using Iterators : " + i.next());
        }


    }
}
