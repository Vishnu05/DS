package Java.String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


/*Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine()
 method. It makes the performance fast. It inherits Reader class. */

public class BufferReaderEx {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("C:\\Users\\vthamizh\\Documents\\New folder\\DS\\src\\Java\\String\\reader.txt");
        BufferedReader bf = new BufferedReader(fr);
        System.out.println(bf);

    }
}
