package Java.Basics.Strings;

public class String_for {
    static String rec = "ABCA";
    static char recc[] = rec.toCharArray();


    static String check() {
        if (rec.equals(recc))
            return rec;
        return rec;
    }


    public static void main(String args[]) {

        String name = "Immu5ta7ble";
        int chars = name.charAt(1);
        char myname;//=String.valueOf();
        //   System.out.println(myname);
        //Boolean bj=Character.isAlphabetic(name);

        char isname;
        for (int i = 0; i < name.length(); i++) {
            isname = name.charAt(i);
            System.out.println(isname);
        }

        for (int i = 0; i < name.length(); i++) {
        }

        System.out.println(Character.isLetter('5'));
        //char mychar='s,c';

        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
        }
    }
}
