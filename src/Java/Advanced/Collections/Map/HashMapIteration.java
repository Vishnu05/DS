package Java.Advanced.Collections.Map;

import java.util.*;

public class HashMapIteration {

    public static void main(String args[]) {

        Map<String, Integer> hm = new HashMap<>();

        hm.put("one", 4);
        hm.put("two", 4);
        hm.put("three", 43);

        // simple way, using lambda expression
        hm.forEach((key, value) -> System.out.println("Key : " + key + " value : " + value));

        // for each by, Map.EntrySet
        for (Map.Entry objectToIterate : hm.entrySet()) {
            System.out.println("key, value in the for each using Map.Entry " + objectToIterate
                    + " . extracting key : " + objectToIterate.getKey() + " , extracting value : " + objectToIterate.getValue());

        }

        // entry set will return all the values from the map
        System.out.println("Entry set are : " + hm.entrySet());

    }
}
