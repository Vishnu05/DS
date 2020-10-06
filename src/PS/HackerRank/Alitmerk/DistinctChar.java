package PS.HackerRank.Alitmerk;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DistinctChar {

    public static void main(String[] args) {

        String s [] = {"aaabbs", "bbcc", "ttoohh"};

        String prefix = "aaa";

        List<String> sss = new ArrayList<>();

        List<String> result = new ArrayList<>();

        sss.add("aaabbs");

        String ss[] = new String[sss.size()];

        for(int i = 0; i < sss.size(); i++) {
            ss[i] = sss.get(i);
        }


        for (int i = 0; i < ss.length; i++) {

            char arr[] = ss[i].toCharArray();
            Set<Character> set = new LinkedHashSet<>();

            boolean prefixChecking = false;
            int count = 0;

            for (int k = 0; k < prefix.length(); k++) {
                char pre[] = prefix.toCharArray();
                if (pre[k] == arr[k]) {
                    count++;
                }
            }

            if (count == prefix.length() && count != 0) {
                prefixChecking = true;
            }

            if(prefixChecking) {
                for (int j = 0; j < arr.length; j++) {
                    set.add(arr[j]);
                }
            }


            System.out.println(set.size());
        }

    }
}
