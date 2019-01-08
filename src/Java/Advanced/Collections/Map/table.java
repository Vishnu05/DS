package Java.Advanced.Collections.Map;

import java.util.Hashtable;
import java.util.Map;

public class table {

    public static void main(String[] args) {
        Hashtable<Integer, String> ob = new Hashtable<Integer, String>();
        ob.put(1, "vishnu");
        ob.put(2, "Thamizharasan");
        ob.hashCode();

        for (Map.Entry<Integer, String> e : ob.entrySet()) {

            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(ob.get(2));
    }
}