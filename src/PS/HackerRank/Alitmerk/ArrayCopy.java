package PS.HackerRank.Alitmerk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.System.*;

public class ArrayCopy {

    public static void main(String[] args) {
        int [] a = new int[] {1,2,3};
        int [] b = Arrays.copyOf(a, 5);
        int [] copy = Arrays.copyOfRange(b,0,4);
        for (int i : copy){
            System.out.println(i);
        }

        int p = 5;
        System.out.println("hello");
//        5<6 ? 5:6;

        out.println("ABC");

        Set s = new HashSet();
        s.add(3);
//        SortedSet ss = new Iterable<>(), NavSortedSet;
        CopyOnWriteArrayList ob = new CopyOnWriteArrayList();
        ob.add(2);
        ob.get(0);
//        ob.remove

//        SortedSet sortedSet = new SortedSet() {
//        }

    }
}
