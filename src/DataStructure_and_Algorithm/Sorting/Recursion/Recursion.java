package DataStructure_and_Algorithm.Sorting.Recursion;

public class Recursion {

    static int mem(int n) {

        count++;
        if (n <= 1)
            return count;
        else
            return n - mem(n - 1);
    }

    static int count = 0;

    static int fun(int n) {

        count++;
        if (n == 100) {
            return count;
        } else
            return fun(n + 2);
    }

    public static void main(String[] args) {

        System.out.println(mem(3) + "  " + fun(2)); //mem(5);
    }
}
