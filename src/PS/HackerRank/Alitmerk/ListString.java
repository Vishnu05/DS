package PS.HackerRank.Alitmerk;

import java.util.ArrayList;
import java.util.List;

public class ListString {

    public static void main(String[] args) {

        List<String> s = new ArrayList<>();
        s.add("hi");
        s.add("new");

        String ss[] = new String[s.size()];

        for(int i = 0; i < s.size(); i++) {
            ss[i] = s.get(0);
        }

    }
}
