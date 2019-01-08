package Java.Basics.Prob;

public class GCD {

    static int main(int a, int b) {

        int temp =0, temp1 = 0,glo=0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(temp=i);

            }
        }
        System.out.println(temp+"go");
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                System.out.println(temp1 = i);
            }
        }
        // System.out.println("The GCD numbers are :"+temp+" And the second numbers are :"+temp1);
        return temp + temp1;
    }

    // stack overflow error
    static void recursive(){

        recursive();
    }
    public static void main(String args[]) {
       // main(5, 12);
        int temp =0, temp1 = 0,glo=0;

        recursive();
    }
}
