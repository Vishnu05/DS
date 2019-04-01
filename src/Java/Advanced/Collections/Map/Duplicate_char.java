package Java.Advanced.Collections.Map;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_char {

    public static void main(String[] args) {

        Map<String, String> ob = new HashMap<>();
        String s = "aassvfdd";

        Set<String> obj = new HashSet<>();
        char arr[] = s.toCharArray();
        int j = 0;
        for (int i : arr) {
            obj.add(String.valueOf(arr[j]));
            j++;
        }
        System.out.println(obj);
    }
}
