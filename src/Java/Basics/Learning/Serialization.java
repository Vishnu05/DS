package Java.Basics.Learning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Serialization {

    public static void main(String[] args) throws Exception{

        PrintStream ob=new PrintStream("C:\\Users\\vthamizh\\Downloads\\sample.json");
      //  InputStream obj=new InputStream("") {};
        FileOutputStream obj=new FileOutputStream("C:\\Users\\vthamizh\\Downloads\\sample.json");

        ob.print("1");

    }
}
