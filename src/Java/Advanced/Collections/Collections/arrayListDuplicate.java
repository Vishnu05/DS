package Java.Advanced.Collections.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class arrayListDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 5, 7, 8, 3, 8, 7));

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);


    }
}
