package PS.Pattern;

import java.util.Scanner;

public class PatternStar {
    public static void main(String args[]) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the size of Star : ");
        int n = var.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
