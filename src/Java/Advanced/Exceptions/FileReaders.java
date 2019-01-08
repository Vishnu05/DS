package Java.Advanced.Exceptions;

import java.io.File;

public class FileReaders {

    public static void main(String args[]) {

        File var = new File("c://users//vishnu thamizharasn//desktop//printer.txt");
        //  FileReader var1=new FileReader(var);

//        String conv="hello";
//        int star=int.Parse("");

        int var1[] = new int[]{45, 54};
        //Array index out of bounce which the array holds two element you ask for third element
        try {
            System.out.println(var1[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            // System.err(e.printStackTrace(System e));

        }
    }
}
