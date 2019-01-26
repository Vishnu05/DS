package Java.Advanced.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class traverse {

    public static void main(String a[]) {

        Map<Integer, Integer> obj = new HashMap<>();
        int b[] = {1, 3, 4, 5, 6, 7};
        // obj=b;

        for (int i : b) {
            System.out.print(i + " ");
        }

    }
}
