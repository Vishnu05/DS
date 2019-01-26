package Java.Basics.Strings;

public class Split {

    public static void main(String[] args) {

        String trim="Java is powerful and versatile language";
        String []a=trim.split("a",3);
        //System.out.println(a.toString());

        for(String b:a){
            System.out.println(b);
        }
    }
}
