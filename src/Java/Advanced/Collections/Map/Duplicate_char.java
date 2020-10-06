package Java.Advanced.Collections.Map;



import java.util.*;

/** Set use unique value to store the data, by using them we can find out easy  */
public class Duplicate_char {

    public static void main(String[] args) {

        String s = "aassvfdd";

        Set<Character> obj = new LinkedHashSet<>();
        char arr[] = s.toCharArray();

        for (Character c : arr) {
            obj.add(c);
        }

        // why I made this much complex, hehe
     /*   int j = 0;
        for (int i : arr) {
            obj.add(String.valueOf(arr[j]));
            j++;
        }*/


        System.out.println(obj);
    }
}
