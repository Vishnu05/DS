package Java.Advanced.Collections.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashMap_reloaded {

    public static void main(String[] args) {

        Map<Integer, String> ob = new LinkedHashMap<>();

        //hashmap inserting order
        ob.put(871, "Vishnu");
        ob.put(62, "typeScript");
        ob.put(91, "Thamizharasn");
        ob.put(653, "Java");
        ob.put(489, "Javascript");
        ob.put(10, "Scripting");
        ob.put(200, "Html");
        ob.put(201, "html");

        System.out.println(ob + "\n");

        ob.forEach((q, e) -> System.out.println(q + " = " + e));
        System.out.println();
        Set set = ob.entrySet();
        System.out.println(set + "\n");
        set.forEach(e -> System.out.println(e));
        //   ob.clear();

        Map<Integer, String> tm2 = new TreeMap<>(ob);
        System.out.println(tm2);
        // Iterator()

        System.out.println("getting values : " + ob.get(201));
        //   System.out.println(ob.keySet());

        /* To get the values using key other methods are seen in this post
         * https://www.techiedelight.com/get-map-key-from-value-java/
         * https://stackoverflow.com/questions/1383797/java-hashmap-how-to-get-key-from-value
         * */
        for (Map.Entry<Integer, String> entry : ob.entrySet()) {
            if (entry.getValue().equals("html")) {
                System.out.println(entry.getKey());
            }
        }

        //for (int i = 0;i < )
        System.out.println("Contains keys : " + ob.containsKey(200));
        System.out.println("Contains keys : " + ob.containsValue("htmla"));

        /** TreeMap stores the values in ascending order it checks with the key and arrange its order*/
        Map<Integer, String> tm = new TreeMap<>();

        tm.put(1, "Ds");
        tm.put(10, "Linked list");
        tm.put(4, "Nodes");
        tm.put(18, "Binary tree");

        System.out.println(tm);

        Map<String, Integer> tm1 = new TreeMap<>();
        tm1.put("Ds", 1);
        tm1.put("Linked list", 10);
        tm1.put("Nodes", 4);
        tm1.put("Binary tree", 18);

        System.out.println(tm1);

    }
}
