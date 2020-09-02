package PS.HackerRank.Java;

import java.util.Scanner;

public class std {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int i = ob.nextInt();
        Double d = ob.nextDouble();
        ob.nextLine(); // ??
        String s = ob.nextLine();

        System.out.println("String :" + s);
        System.out.println("Double :" + d);
        System.out.println("Int :" + i);
    }
}
