package PS.Pattern;


import java.util.Scanner;

public class Normal_pattern {

    public static void main(String args[]) {

        Scanner var = new Scanner(System.in);
        System.out.println("Enter the Pattern size : ");
        int n = var.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }

    }
}
