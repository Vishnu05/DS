package PS.Problems.Volentech;

import java.io.BufferedReader;
import java.io.FileReader;

public class Palindrome {

    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\Vishnu Thamizharasan\\Desktop\\files\\dict.txt";
        BufferedReader bf = new BufferedReader(new FileReader(filePath));

//        int file = bf.read();

        String file = bf.readLine();

        while (file != null) {

            // System.out.println(file);
            file = bf.readLine();
        }
        // naive approach

        String s = "wow";
        /** Rather going for array traversing, StringBuilder has inbuilt reverse method */
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        System.out.println("Actual String : " + s + " Reversed String : " + builder);

        /** checking whether two string are equal or not */
        // builder is a object, and if we check without toString it will return false.
        if (s.equals(builder.toString())) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }
}
