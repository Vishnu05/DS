package Programs;

public class ReverseTheNumber {

    public static void main(String[] args) {

        int n = 12345;
        int reverse = 0;
        int a, b;
        while (n > 0) {
            a = reverse * 10;
            b = n % 10;
            reverse = a + b;
            n = n / 10;
        }
        System.out.println(reverse);

    }
}
