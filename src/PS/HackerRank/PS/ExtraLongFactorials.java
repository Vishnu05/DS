package PS.HackerRank.PS;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        BigInteger bi = new BigInteger("1");

        for (int i = n; i > 0; i--) {
            /*no idea what this peace of code is all i know big integer can store huge amount of numbers*/
            bi = bi.multiply(BigInteger.valueOf(i));
        }

        System.out.println(bi);
    }
}
