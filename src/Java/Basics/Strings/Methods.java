package Java.Basics.Strings;

public class Methods {
    public static void main(String args[]) {

        String comp = "hello";
        String str = "helllo";

        int calc = comp.length();
        System.out.println(calc);
        /* The compareTo method will compare the two string and tell where the difference occurs*/
        System.out.println("Comparing result " + comp.compareTo(str));

        /*String hashcode*/
        System.out.println("Hashcode of string "+comp.hashCode());

        String val="Vishnu";
        String s=val.replace("Vis","Tais"); // can replace a single char or even whole string
        System.out.println(s);
    }
}
