package PS.HackerRank.RecruitmentTest;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ArrayReduction {

    static int reductionCost (List<Integer> n) {

       int count = 0;


       for(int i = 0; i < n.size(); i++) {
           int size = n.size();
           int j = (size - (n.size() - 1));
           count = n.get(i) + n.get(j);
           n.remove(i);
           n.remove(j);
           n.add(i, count);
          // j++;
       }


        return count;
    }
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        reductionCost(list);

    }
}
