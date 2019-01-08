package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void main(String args[]) {

        ArrayList<String> ob = new ArrayList<>();

        ob.add("a");
        ob.add("wbc");
        ob.add("mj");
        ob.add("xi");
        ob.add("youtube");

        System.out.println("Before sorting ");
        for (String i : ob) {
            {
                System.out.println(i);
            }
        }

        /* this does sorting operations */
        Collections.sort(ob);
        System.out.println(Collections.addAll(ob));

        System.out.println("After sorting ");
        for (String i : ob) {
            System.out.println(i);
        }

        /*This is reverse sorting */
        Collections.reverse(ob);
        System.out.println("Reverse sorting ");
        for (String i : ob) {
            System.out.println(i);
        }
    }
}
