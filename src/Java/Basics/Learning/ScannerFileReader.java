package Java.Basics.Learning;

import java.io.File;
import java.util.Scanner;

public class ScannerFileReader {

    public static void main(String[] args) {

        File fl = new File("C:\\Users\\vthamizh\\IdeaProjects\\DS\\src\\Java\\Java.Basics.Basics\\brrs.txt");

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            System.out.println(fl);
        }
    }
}
