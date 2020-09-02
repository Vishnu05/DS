package Java.HackerRank.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Java_List {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        List<Integer> list = new ArrayList();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            String s = scan.next();

            if (s.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            }

            if (s.equals("Delete")) {
                int x = scan.nextInt();
                list.remove(x);
            }
        }

        list.set(3, null);
//        for (int i : list) {
//            System.out.print(i + " ");
//        }


        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
