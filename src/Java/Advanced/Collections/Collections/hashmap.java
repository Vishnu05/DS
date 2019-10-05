package Java.Advanced.Collections.Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {

        Map<Integer, String> ob = new HashMap<>();

        ob.put(111, "Hashing ");
        ob.put(26, "the functions");
        ob.put(63, "method  invocation");
        ob.put(489, "collision ");
        ob.put(52, "congestion");
        ob.put(6, "chaining");

        System.out.println(ob.keySet());  //keySet will return the key value of map

        HashMap<String, String> obs = new HashMap<>();

        obs.put("a", "b");
        obs.put("c", "b");
        obs.put("e", "b");
        obs.put("g", "b");
        System.out.println(obs.keySet());
        System.out.println(obs.hashCode() + " entry set " + obs.entrySet() + "\n" + obs);

        for (String a : obs.values()) {
            System.out.println(a);
        }

        // lambdas are anonymous function
        obs.forEach((s, g) -> System.out.println("Lambda key value " + s + " = " + g));

    }
}
