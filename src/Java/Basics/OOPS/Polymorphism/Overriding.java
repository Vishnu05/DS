package Java.Basics.OOPS.Polymorphism;

public class Overriding {

    String method = "String are good";

    void override(String method) {

        method = "Override ";
        System.out.println(method);
    }

    static {

        System.out.println("Hey this is static when ever the class is called i'm invoking ");
    }

    public static void main(String args[]) {

//        Overriding ob = new Overriding();
//        ob.override("Passing the arguments ");
          over ob=new over();
          ob.override("Happy");
    }
}



class over extends Overriding {

    void override(String method) {
        this.method = method;
        System.out.println(method);

    }
}