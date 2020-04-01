package DataStructure_and_Algorithm.Programs;

import java.util.regex.Pattern;

public class ReverseTheNumber {

    public static void main(String[] args) {

        int n = 12345;
        int reverse = 0;
        int a, b;

        /* This is how you reverse a number Formula kinda thing ..?*/
        while (n > 0) {
            a = reverse * 10;
            b = n % 10;
            reverse = a + b;
            n = n / 10;
        }
        System.out.println(reverse);

        double f = 9 / 3d;
        System.out.println(f);
        Pattern isInteger = Pattern.compile("/d");

        if(f == (int)f) {
            System.out.println("Integer checking");
        } else {
            System.out.println("not working I suppose ");
        }
    }
}
