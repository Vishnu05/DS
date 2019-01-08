package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Loops {

    /**/
    public static void main(String args[]) {

        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(162);
        ob.add(48);
        ob.add(14);
        ob.add(57);
        ob.add(98);

        /*Normal for loop*/
        for (int i = 0; i < ob.size(); i++) {
            System.out.println(ob.get(i));
        }

        /*For each loop Advanced loop  enhanced for loop */
        for (int i : ob) {
            System.out.println("For each loop " + i);
        }

        /*While loop*/
        int i = 0;
        while (i < ob.size()) {
            System.out.println("While loop " + ob.get(i));
            i++;
        }

        /*Iterators */
        Iterator var=ob.iterator();
        while(var.hasNext()){
            System.out.println(var.next());
           // break;
        }
    }
}