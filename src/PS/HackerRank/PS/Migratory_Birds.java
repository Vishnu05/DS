package PS.HackerRank.PS;

import java.util.*;

public class Migratory_Birds {

    static void birds(int count[], int arr[]) {
        int n = arr.length;
        int count1[] = new int[count.length];
        for (int i = 0; i < count.length; i++) {

            for (int j = 0; j < n; j++) {
                if (count[i] == arr[j]) {
                    count1[i] += 1;
                }
            }

        }

        int temp = 0;
        int j = 0;
        for (int i = 1; i < count1.length; i++) {
            if (count[j] < count[i]) {
                j = i;
            }
        }
        System.out.println(count[j]);
        temp = j;

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < count.length; i++) {
            map.put(count[i], count1[i]);
        }

        int finals[] = new int[count.length];

        int temp1 = map.get(count1[j]);
        System.out.println(temp1);
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(temp1)) {
                finals[k++] = entry.getKey();
            }
        }

        k = 0;
        for (int i = 0; i < finals.length; i++) {
            if(finals[k] > finals[i]) {
                k = i;
            }
        }

        System.out.println(count[k]);
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int arr1[] = new int[set.size()];
        Object ob[] = set.toArray();

        System.out.println(Arrays.toString(ob));
        System.out.println(ob[0]);

        for (int i = 0; i < ob.length; i++) {
            arr1[i] = (int) ob[i];
        }

        int count[] = arr1;

        birds(count, arr);

    }
}
