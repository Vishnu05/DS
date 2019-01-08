package Java.Basics.Java;

import java.io.FileReader;

public class Files  {

    public static void main(String vishnu[]){

        try {
            FileReader ob = new FileReader("C:\\Users\\Vishnu Thamizharasan\\Downloads\\Vishnu\\vishnu thamizharasan.pdf");
        }
        catch (Exception e){
            System.out.println(e.getCause()+e.getMessage());
        }
    }
}
