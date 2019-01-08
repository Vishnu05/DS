package Java.Basics.Prob;

public class Prime1_100 {

    public static void main(String args[]) {

        int a = 100;
        for (int i = 2; i < a; i++) {
            boolean b = true; // this part i couldn't understand

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                   // break;
                }
            }

            if (b) {
                System.out.print(i + " ");
            }
        }

    }
}
