package Java.Prob.Probs;

public class Factorial {

    public static void main(String[] args) {

        int n = 10;
        double temp = 1;

        String a = "";
        a = String.valueOf(temp);

        for (int i = 1; i <= n; i++) {

            temp *= i;

            System.out.println(temp);
        }
    }
}
