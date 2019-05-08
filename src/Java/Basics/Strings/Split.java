package Java.Basics.Strings;

public class Split {

    public static void main(String[] args) {

        String trim = "Java is powerful and versatile language";
        String[] a = trim.split("a", 3);
        //System.out.println(a.toString());

        for (String b : a) {
            System.out.println(b);
        }

        String s = "String Split";
        //String arr[]=s.split(3);
        String ss = "HI";

        ss=ss+ss+ss;


            int i=0;
        while(i<3){
            ss=ss+ss;
        }
        System.out.println(ss);
    }
}
