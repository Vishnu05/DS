package Java.Basics.Boxing;

public class Wrapper {

    public static void main(String args[]) {

        int a=4;
        int b=Integer.valueOf(a);

        System.out.println(b);

        Integer ob=new Integer(2);
        int c=ob;
        System.out.println(ob);
    }
}
