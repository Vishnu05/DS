package DataStructure_and_Algorithm.Sorting.Recursion;

public class Recursion {

    static int mem(int n) {

        if (n <= 1)
            return 1;
        else
            return n - mem(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(mem(5)); //mem(5);
    }
}
