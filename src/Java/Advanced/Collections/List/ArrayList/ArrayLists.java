package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String args[]) {

        // List ??
        List<String> ob = new ArrayList<>();

        /* add method add the elements in array */
        ob.add("Vishnu");
        ob.add("ram");
        ob.add("Douche bag");

        for (String i : ob) {

            System.out.println(i);
        }

        ob.add(1, "Heap and stack");


        //remove the elements by index or there property value
        ob.remove("ram");

        /*To check the element index number, if the element is not there it gives -1 index*/
        System.out.println(ob.indexOf("Douche bag"));

        /* this method help to update the array*/
        ob.set(2, "He is a good guy");

        /* This helps to get a specific elements in array by index*/
        System.out.println(ob.get(1));

        /*it returns the value of array size*/
        System.out.println(ob.size());

        /*boolean expression if the value present returns true else returns false*/
        System.out.println(ob.contains("vishnu"));

        System.out.println("The list are  " + ob);

        /*It flush out all the array element in that object*/
        ob.clear();
        System.out.println("After flushing out " + ob);

    }
}
