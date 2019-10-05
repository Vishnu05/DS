package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {

        /** ArrayList comes with handy for dynamic array size unlike array arrayList size can be reduced and increased
        * major disadvantage is whenever we insert or delete a element other element has to be sifted it make less efficient
        * search is fast
        * Dynamic array
         * Iterators will iterator if it is null, for loop will throw null pointer exception when it encounters null value */
        List<Integer> obj = new ArrayList<>();

        obj.add(121);
        obj.add(2);
        obj.add(333);
        obj.add(34);

        System.out.println("Before clearing : " + obj.size());
        obj.remove(2);
        System.out.println("Values check in the arrayList : " + obj.contains(12));

        //obj.addAll(1,2);

        for (int a : obj) {
            System.out.print(a + " ");
        }
        System.out.print("\n");

        obj.addAll(obj);
        obj.forEach(n -> System.out.print(n + " "));
        //obj.clear();
        System.out.println("After clearing : " + obj.size());

        ArrayList<Integer> ob = new ArrayList<>(2);
        ob.addAll(obj);
        System.out.println("Initial capacity : " + ob);

        ob.add(11);
        ob.add(12);
        ob.add(13);
        ob.add(14);
        ob.set(9, 355);
        System.out.println("Get class : "+ob.getClass()); //
        System.out.println(ob.size() + " : " + ob);
        System.out.println("Is empty checking : " + ob.isEmpty());
        ArrayList ob1 = new ArrayList<>();
        System.out.println(ob1.size());

        List<String> ob2=new LinkedList<>();

        int arry [] = {2, 54, 32, 45};

        List<Integer> li = new ArrayList(Collections.singleton(arry));
        System.out.println(ob);
        ob2.add("Vishnu");
        System.out.println(ob2.size());

        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
    }
}
