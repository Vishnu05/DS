package Java.Java_Libary.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class DataMappingLength {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {


        /** fileWriter can be done also by PrintStream */
        int n = scan.nextInt();
        PrintStream ps = new PrintStream(String.valueOf(new FileWriter("dats.txt")));
       // FileWriter file = new FileWriter("data_mapping_length.txt");
      //  BufferedWriter bw = new BufferedWriter(file);

        int arr [] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = -1;

        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            System.out.println(count);
            ps.println(count);
        }

        ps.close();

    }
}
