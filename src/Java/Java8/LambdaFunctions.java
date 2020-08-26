package Java.Java8;

//import Java.Advanced.Collections.Map.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaFunctions {

    public static void main(String args[]) {

        Map<Integer, String> hm = new LinkedHashMap<>();
        hm.put(1, "Vishnu");
        hm.put(2, "Thamizharasan");
        hm.put(3, "Lambda functions");
        hm.put(4, "streams");

        System.out.println(hm.get(hm));
        System.out.println(hm);
        // foreach(Map -> System.out.println(Map));

        hm.forEach((key, value) -> System.out.println("lambda expression key: " + key + " value : " + value));

    }
}
