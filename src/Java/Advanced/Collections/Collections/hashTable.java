package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

// congestion, collusion, same key value ?

public class hashTable {

    public static void main(String a[]) {

        Hashtable<String, Integer> ob = new Hashtable<>();
        ob.put("james", 12);
        ob.put("lebron", 10);
        ob.put("james", 15);
        System.out.println(ob.get("james"));
        System.out.println(ob.keySet());
        System.out.println(ob.containsKey("james") + " . . ");
        System.out.println(ob);

        Hashtable<String, String> obj = new Hashtable<>();
        obj.put("key", "value");
        obj.put("key1", "value1");
        obj.put("key2", "value2");
        obj.put("key3", "value3");
        System.out.println("hashsize : " + obj.size());

        List<String> oh = new ArrayList<>();
        oh.add("alex");
        oh.add("raj");
        oh.add("maria");
        System.out.println("size : " + oh.size());

        for (String sa : oh) {
            System.out.println();
        }

    }
}
