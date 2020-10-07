package Java.Java_Libary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class bufferReader {

    public static void main(String[] args) throws Exception {
        /** To read a file from the location there are many ways to do that
         * using FileReader, BufferedReader to read the data from the file */

        String filePath = "C:\\Users\\Vishnu Thamizharasan\\Desktop\\files\\dict.txt";
        BufferedReader bf = new BufferedReader(new FileReader(filePath));

        //  if the filePath string is empty throw an exception
        if (filePath != "") {
            System.out.println("The file contents is : " + bf);
        } else {
            throw new FileNotFoundException("Maybe the file is not in this path");
        }

        /** To read the content of the file java has certain inbuilt methods to do so */
        String line = bf.readLine(); // string method which reads current line
        int chars = bf.read(); // read a single character

        System.out.println("String " + line);
        System.out.println("Character " + chars);

        /** Read all the file content and I'm not 100% sure how it iterates */
        while (line != null) {
            System.out.println(line);
            line = bf.readLine();
        }

        /** closing the buffered reader object session */
        bf.close();


    }
}
