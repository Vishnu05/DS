package Java.Basics.Java;

public class absta implements Abstract {


    public void addfunction() {
        int a = 4, b = 5, temp;

        temp = a + b;
        System.out.println(temp);
    }

    public String fun() {

        String a = "Vish", b = "thami", c;
        c = "the " + a + "" + b;
        return "c";
    }

    absta(int a) {
        System.out.println("Hey i'm constructor i can do what the hell ever i want " + a);
    }

    absta(float v) {
        System.out.println(" the String is " + v);
    }

    public void subfun() {

    }

    public void oddoreven() {

    }

    public static void main(String args[]) {

        absta ob = new absta(5);
//        absta(4.4f);
        ob.addfunction();

        System.out.println(ob.fun());
    }
}
