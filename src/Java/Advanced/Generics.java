package Java.Advn;

import java.util.Arrays;

public class Generics<T> {

    T ob;

    Generics(T ob) {
        this.ob = ob;
        System.out.println(ob);
    }

    static <e> void gene(e[] ob) {
        System.out.println(Arrays.toString(ob));
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i]);
        }
    }

    public static void main(String[] args) {

        Generics<Integer> in = new Generics(1);
        Integer arr[] = {1, 3, 6, 7, 10};
        gene(arr);
    }

}
