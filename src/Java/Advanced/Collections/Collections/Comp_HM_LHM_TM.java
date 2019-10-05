package Java.Advanced.Collections.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Comp_HM_LHM_TM {

    public static void main(String[] args) {

        // order of insertion will be same
        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(40, "Browser");
        lhm.put(1, "Dom");
        lhm.put(134, "Nodes");
        lhm.put(65, "elements");
        lhm.put(321, "V8");

        System.out.println(lhm);

        // ascending order of insertion
        Map<Integer, String> tm = new TreeMap<>();
        tm.put(410, "Browser");
        tm.put(14, "Dom");
        tm.put(134, "Nodes");
        tm.put(65, "elements");
        tm.put(321, "V8");

        System.out.println(tm);

        /// order of insertion ?
        Map<Integer, String> map = new HashMap<>();
        map.put(420, "Browser");
        map.put(12, "Dom");
        map.put(1234, "Nodes");
        map.put(625, "elements");
        map.put(3221, "V8");

        System.out.println(map);

    }
}
