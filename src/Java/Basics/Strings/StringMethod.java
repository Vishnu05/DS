package Java.Basics.Strings;

public class StringMethod {

    public static void main(String args[]) {

        final String h = String.format("hey "
                + "this is " +
                "vishnu" +
                "thamizharasan"
        );
        System.out.println(h);
        // h="sucks";
        System.out.println(h);

        String var = "Let use charAt method";
        // this is like array we can get a char by telling the index of string
        char s = var.charAt(1);
        System.out.println(s);

    }
}
