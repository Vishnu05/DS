package Java.HackerRank.Java;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int a[]) {
        this.elements = a;
    }

    int computeDifference() {

        int j = 1, i = 0;
        int temp = 0;
        int temp1 = 0;
        int foo = 1;
        for (i = 0; i < elements.length; i++) {
            if (elements[i] < elements[foo]) {
                foo = i;
            }
        }
        temp = elements[foo];

        foo = 1;
        for (i = 0; i < elements.length; i++) {
            if (elements[i] > elements[foo]) {
                foo = i;
            }
        }
        temp1 = elements[foo];

        maximumDifference = temp1 - temp;
        return maximumDifference;
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}