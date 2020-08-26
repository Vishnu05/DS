package DataStructure_and_Algorithm.HackerRank.RecruitmentTest;

import Java.Basics.Learning.ScannerFileReader;

import java.util.Scanner;

public class Sequence {

    static long getSequenceSum(long i, long j, long k) {

        long count = 0;
        for (long i1 =  i; i1 < j; i1++) {
            count = i1 + count;
        }

        for (long i2 =  j; i2 >= k; i2--) {
            count = i2 + count;
        }
        return  count;
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        long i = in.nextLong();
        long j = in.nextLong();
        long k = in.nextLong();

        System.out.println(getSequenceSum(i,j,k));

    }
}
