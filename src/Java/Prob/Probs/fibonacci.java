package Java.Prob.Probs;

public class fibonacci {

    static int fib(int n) {

        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + (n - 2);
    }


    static int iter(int n) {

        int i = 0, j = 1, temp = 0;
        for (int k = 1; k < n; k++) {
            temp = i + j;
            i = j;
            j = temp;
            System.out.print(" " + temp);
        }
        System.out.println();
        return temp;
    }

    public static void main(String a[]) {

        //System.out.println("iter(10)" + "  " + fib(11));
        //       System.out.println(mission(5));
    }
}
