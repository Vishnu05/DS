package Java.Java_Libary.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class bufferWriters {

    public static void main(String[] args) throws Exception {


        //   BufferedReader br = new BufferedReader(new FileReader("brr.txt"));
        String read;
        //System.out.println(br.lines());

        try {
            FileWriter fw = new FileWriter("C:\\Users\\vthamizh\\IdeaProjects\\DS\\src\\Java\\Java.Basics.Basics\\brrs.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello Hello this is buffered reader\n" +
                    "and this entire string of word\n" +
                    "is going to read and write by the buffered\n" +
                    "reader brace yourself compliers.");
            bw.write("Files has ended");
            bw.write(2);
            bw.write(578762);
            bw.write(23424);
            /* if we don't close the bw it doesn't print */
            bw.close();
            System.out.println(bw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
