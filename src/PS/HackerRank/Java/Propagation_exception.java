package Java.HackerRank.Java;

import java.util.Scanner;

class Calculator {

    int power(int nn, int pp) throws Exception {

        double result = 0;

        double n = Double.valueOf(nn);
        double p = Double.valueOf(pp);

        if (n >= 0 && p >= 0) {
            result = Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }

        int temp = (int) result;
        return temp;

        /* better solution
        *  if (n < 0 || p < 0) {
        *        throw new Exception("n and p should be non-negative");
        *   }
        *
        *  return (int) Math.pow(n, p);
        * */
    }
}

public class Propagation_exception {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}


