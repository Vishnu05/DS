package Java.Recapature.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {

    public static void main(String args[]) {
        List listObj = new ArrayList();
        listObj.add("String");
        listObj.add(1);
        listObj.add(true);
        listObj.add('c');

        System.out.println(listObj);
        System.out.println(listObj.get(3));

        for (int i = 0; i < listObj.size(); i++) {
            System.out.println("Iteration done by for loop: " + listObj.get(i));
        }

        System.out.println("Size of the list" + listObj.size());

        System.out.println(listObj.iterator().toString());
        listObj.forEach((value) -> System.out.println("Lamda expression " + value));



        for (Object i : listObj) {
            System.out.println("For each : " + i);
        }

        /*object data type*/

        Object ob = 1;
        System.out.println(ob);
        ob = "It can be string type";
        System.out.println(ob);


    }

}
