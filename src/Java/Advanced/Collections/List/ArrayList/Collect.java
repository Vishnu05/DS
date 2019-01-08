package Java.Advanced.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collect {

    public static void main(String args[]){

        Object ob[]=new Object[5];
        ob[1]=5;

        Collection obj=new ArrayList();
        obj.add(5);
        obj.add("Java collections");
        obj.add(5.2);

        Iterator i=obj.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
