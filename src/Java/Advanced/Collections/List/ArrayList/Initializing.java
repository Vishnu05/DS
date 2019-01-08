package Java.Advanced.Collections.List.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Initializing {

    public static void main(String args[]) {

        ArrayList<String> ob = new ArrayList<String>(

                /* It looks like arguments  Arrays.asList(object,1,2 ..)*/
                Arrays.asList("vishnu", "dreaming ", "searching the purpose ", "dumb thing"));
        ob.remove(1);
        System.out.println("Retrieving the list " + ob);

        /* How to say this.. this syntax is good */
        ArrayList<?> obj = new ArrayList<String>() {{

            add("This is ");
            add("dope");
            add("for small ");
            add("type array");
        }};
        System.out.println("Anonymous type " + obj);


        /* ncopies the n is how many times and object will print to that n times*/
        ArrayList<?> ob1 = new ArrayList<>(Collections.nCopies(5, 10));
        System.out.println("Ncopies are +" + ob1);
    }
}
