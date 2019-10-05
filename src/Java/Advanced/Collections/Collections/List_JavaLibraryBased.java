package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.List;


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


    }
}
