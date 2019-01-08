package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAll {

    public static void main(String args[]) {

        ArrayList<String> obj = new ArrayList<>();

        obj.add("String 1");
        obj.add("String 2");
        obj.add("String 3");
        System.out.println("Array List "+obj);

        List<String> ob=new ArrayList<>();
        ob.addAll(obj);

        System.out.println(ob);

    }
}
