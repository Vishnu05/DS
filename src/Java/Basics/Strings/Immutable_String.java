package Java.Basics.Strings;
/*
final String var = "This variable dec cannot be changed since it is final access specifier";
//string immutable are also like this(not sure)
String var2 = "";
*/
public class Immutable_String {

    public static void main(String args[]) {

        String a="hi"+"world";
        String b="hi"+"wo"+"r"+"ld";

        if(a.equals(b)){
            System.out.println("Immutable ");
        }
    }
}



