package Java.Basics.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class recursionArray {

    /* IMPORTANT: class must not be public. */

        static int recursive(int n, int ar[], int i) {


            if (n == i) {
                return 0;
            } else {
                ar[i] = scan.nextInt();
                i++;
                return recursive(n, ar, i);
            }
        }

        static Scanner scan = new Scanner(System.in);
        public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
//            node ns = new node();
            System.out.println("Hello World!");
            int i = 0;
            int n = scan.nextInt();
            int ar[] = new int[n];
            recursive(n, ar, i);
            System.out.println(Arrays.toString(ar));
        }
    }



