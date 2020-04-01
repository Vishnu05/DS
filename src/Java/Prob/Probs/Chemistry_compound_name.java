package Java.Prob.Probs;

import java.util.*;

public class Chemistry_compound_name {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* worst case and it will never pass any test cases other than this type of i/p need to be refactored again */
        String s = "Ca23Hcl6";

        String ar[] = s.split("([0-9])");
        String ar1[] = s.split("([a-z,A-Z])");

        System.out.println(ar.length + " : " + ar1.length);

        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                //System.out.println(ch[i]);
                // Pattern.matches("");
            }
        }

        Set<String> set = new LinkedHashSet<>();
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (!ar[i].equals("")) {
                if (set.contains(ar[i])) {
                    set.remove(ar[i]);
                } else {
                    set.add(ar[i]);
                }
            }
        }

        Set<Integer> set1 = new LinkedHashSet<>();
        j = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (!ar1[i].equals("")) {
                if (set1.contains(Integer.parseInt(ar1[i]))) {
                    set1.remove(ar1[i]);
                } else {
                    set1.add(Integer.parseInt(ar1[i]));
                }
            }
        }

        System.out.println(set + " : " + set1);

        HashMap<Object, Object> hm = new LinkedHashMap<>();

        Iterator ij = set.iterator();
        Iterator ij1 = set1.iterator();
        for (int i = 0; i < set.size(); i++) {

            if (ij.hasNext() && ij1.hasNext()) {
                hm.put(ij.next(), ij1.next());
            }
        }

        System.out.println(hm);

    }
}
