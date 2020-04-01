package Java.Basics.Variables;

final class vis {

    String finalKey = "hello";

    void main() {

        System.out.println(finalKey);
    }
}

public class Variables {

    byte pincode;

    short s32278 = 32767;
    static int value = 2000000000;
     String football="Spain";


    void EMp() {

        if (pincode < 128) {
            System.out.println("the byte\\ is  \' crt\'"); // \"  \'this character are special one used to make quotes
        } else System.out.println("it is worng");
    }

    void localvar() {

        byte co;
        int fifa = 2018; // the var will created at when the method is called and destroyed when it's completed
        String country = "russia";
        System.out.println();
        System.out.println("The country hosting for fifa is " + country + " in the year of " + fifa);
    }

    public static void main(String agrs[]) {

        Variables ob = new Variables();
        vis ob1 = new vis();
        ob.localvar();
        ob.fun();
        ob.EMp();
        Variables.value=9;

    }

    void fun() {
        football = "5";
        System.out.println(football);
        System.out.println("checking");
    }
    protected class acces{

    }

}



