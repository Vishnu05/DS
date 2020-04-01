package Java.String;

import java.util.Scanner;

public class Split1 {

    public static void main(String[] args) {

        String name = "ea we re te ye ";

        String ar[] = name.split("e", 3); //expression will split and limit is used to stop this operation
        //till that limit char split will do. ex limit-2,exp-e it will only split 2 "e"
        for (String s : ar) {
            System.out.println(s);
        }

        /*for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }*/

        Scanner o = new Scanner(System.in);
//        String as = o.next();
//        System.out.println("\n" + as);

        /* String em[] = email.split("/( )|(@gmail.com)/"); */

        String email = "vishnu thamizharasan@capgemini.com";
        String em[] = email.split(" ");

//        email

        //  String str [] = new String[10];

        for (int i = 1; i < 2; i++) {
            // str[i] = em[i];
            System.out.println(em[i]);
        }

    }
}
