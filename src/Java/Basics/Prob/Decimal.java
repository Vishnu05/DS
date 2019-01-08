package Java.Basics.Prob;

public class Decimal {

    public static void main(String args[]) {

        int binary[] = new int[10000];

        int i = 0, n = 15; // Binary no to convert decimal
        int count = 0;
        while (0 < n) {
            binary[i] = n % 2;
            n = n / 2;
            i++;
            count +=1;
        }

        System.out.println(count);

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }

}
