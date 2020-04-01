package Java.Prob.Probs;

public class Recursion {

    static int rec(int n) {

        if (n <= 1) {
            return 1;
        }
        return n * rec(n - 1); // factorial
    }

    static int func(int x) {
        if (x <= 0)
            return x;
        return func(x - 1) + func(x - 2); //Java.Prob.Probs.fibonacci
    }


    public static void main(String[] args) {

        System.out.println(rec(5) + "  " + func(5) + " ");

    }
}
