package PS.HackerRank.Java;

import java.util.Calendar;
import java.util.Scanner;

 class Java_Exception_Handling {

     /*
     * Create the method long power(int, int) here.
     s
     */
      static int power(int a, int b) throws Exception{
          double d = Math.pow(a, b);
          int res = (int) d;

          if (a < 0 || b < 0) {
              System.out.println();
          }
          if (a == 0 || b == 0) {
              System.out.println();
          }

          if (a > 0 && b > 0) {
              throw new Exception("");
          } else {
              return 1;
          }
      }

      Calendar ii = Calendar.getInstance();


 }

    public class Solution {
        public static final Java_Exception_Handling my_calculator = new Java_Exception_Handling();

        public static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

