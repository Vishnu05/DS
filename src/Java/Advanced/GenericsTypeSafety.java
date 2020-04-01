package Java.Advn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenericsTypeSafety<T> {

    /**
     * Generics is for type safety and much more it is used mostly in collection
     * To avoid runtime errors of wrong data types it can be prevented
     * Code reuse, while sending different Wrapper class with generics we can handle it
     */

    T ob;

    static <E> void methods(E obj) {
        // this.o =
        System.out.println(obj);
    }

    static <T> void arrMethod(T[] ob) {
        System.out.println(Arrays.toString(ob));
        for (Object e : ob) {
            System.out.println(e);
        }
    }

    static <K, V> void maps(K ob) {

        System.out.println(ob);
//        for (Map.Entry entry :) {
//        }

    }

    public static void main(String[] args) {

        methods("Hello");
        methods(123);
        methods(true);
        methods('c');
        methods(534.3d);

        System.out.println("/** Array are passed in generics */\n");
        Integer ar[] = {1, 54, 76, 23, 89, 2};
        String s[] = {"String", "are", "in generics", "of array"};
        arrMethod(ar);
        arrMethod(s);

        Map value = new HashMap();
        value.put("name", "Vishnu");
        value.put("Age", 23);
        value.put("organization", "Capgemini");
        value.put(1, 7);

        maps(value);
    }

}

