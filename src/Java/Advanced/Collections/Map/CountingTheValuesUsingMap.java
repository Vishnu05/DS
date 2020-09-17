package Java.Advanced.Collections.Map;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Counting the characters occurrence using Map
 */
public class CountingTheValuesUsingMap {

    public static void main(String[] args) {

        String s = "asdasonihojnsdfasadfa";
        char arr[] = s.toCharArray();

        Map<Character, Integer> lhm = new LinkedHashMap<>();

        // normal iterative approach,
        for (int i = 0; i < arr.length; i++) {
            if (lhm.containsKey(arr[i])) {
                // key, value - if the value is present append by one
                lhm.put(arr[i], lhm.get(arr[i]) + 1);
            } else {
                lhm.put(arr[i], 1);
            }
        }

        // forEach
        for (Character c : arr) {
            if (lhm.containsKey(c)) {
                lhm.put(c, lhm.get(c) + 1);
            } else {
                lhm.put(c, 1)
            }
        }
        System.out.println(lhm.entrySet());
    }

}
