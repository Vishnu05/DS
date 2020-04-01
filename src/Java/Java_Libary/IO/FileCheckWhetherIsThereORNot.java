package Java.Java_Libary.IO;

import java.io.File;
import java.io.FileReader;

public class FileCheckWhetherIsThereORNot {


    public static void main(String[] args) {

        File fl = new File("C:\\Users\\vthamizh\\filereader");

        if (fl.exists() && !fl.isDirectory()) {
            System.out.println("true");
        } else {
            System.out.println("Not found!!.. ");
        }

        File fl2[] = new File("C:\\Users\\vthamizh\\filereader").listFiles();

        /* To get the directory path name
        * */
        for (File s : fl2) {
            System.out.println(" List files method are working fine  " + s);
        }

        String fil[] = fl.list();

        int count = 0;
        System.out.println();

        for (String s : fil) {
            System.out.println(s);
            count++;
        }

        if (count > 0) {
            System.out.println("file is there");
        } else {
            System.out.println("Nope");
        }
    }
}
