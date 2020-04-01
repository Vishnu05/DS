package Java.String;

import java.util.ArrayList;
import java.util.Collections;

public class stringBasics {

    public static void main(String[] args) {

        String s = "Vishnu";
        String ss = "Vihnu";
//
//        if (s < ss) {
//
//        }
        ArrayList<String> list = new ArrayList<>();
        list.add("Vishnu");
        list.add("Vihnu");
        Collections.sort(list);

        System.out.println(list);
    }
}
