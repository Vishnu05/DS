package PS.HackerRank.AthenaHealth;

import java.util.*;

/**
 * Hackerrank problem, easy one not able to complete on time, this is not a optimized solution
 * Adding strings in array, then putting them in treemap, finding the highest value of the map
 * extracting the last value of list, TreeMap sort all the data */

public class FeaturedProducts {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] s = new String[n];

        // adding all the strings in array
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }

        System.out.println(Arrays.asList(s));

        Map<String, Integer> lm = new TreeMap<>();

        for (String st : s) {
            if (lm.containsKey(st)) {
                lm.put(st, lm.get(st) + 1);
            } else {
                lm.put(st, 1);
            }
        }

        // getting highest values in map
        int highestValueInMap = 0;

        for (Map.Entry obj : lm.entrySet()) {

            if (highestValueInMap < (int) obj.getValue()) {
                highestValueInMap = (int) obj.getValue();
            }
        }

        System.out.println("Highest value in the map " + highestValueInMap);

        List<String> list = new ArrayList<>();

        // adding the highest value in arraylist
        for (Map.Entry obj : lm.entrySet()) {

            if ((int) obj.getValue() == highestValueInMap) {
                list.add((String) obj.getKey());
            }
        }

        System.out.println("List values are : " + list);
        int listSize = list.size();

        System.out.println("The featured product is : " + list.get(listSize - 1));


    }
}
