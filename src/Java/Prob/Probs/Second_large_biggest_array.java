package Java.Prob.Probs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Second_large_biggest_array {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = {3, 7, 2, 1, 8, 15, 11, 15, 11, 88, 15, 88};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int a = arr[arr.length - 1];
        System.out.println(a);

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        //arr = set.toArray(arr);
        int arr1[] = new int[set.size()];
        int j = 0;
        for (int i : set) {
            arr1[j++] = i;
        }

        set.forEach(aa -> System.out.print(aa + " "));

        System.out.println("\n" + (arr1[arr1.length - 2]));

    }
}
