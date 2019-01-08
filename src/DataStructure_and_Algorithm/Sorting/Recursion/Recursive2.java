package DataStructure_and_Algorithm.Sorting.Recursion;

public class Recursive2 {

    static int recursive(int n) {
        //  n=2;
        if (n <=0) {
            return n;
        }
        try {
            recursive(n - 1);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {

        recursive(10000);
    }

}
