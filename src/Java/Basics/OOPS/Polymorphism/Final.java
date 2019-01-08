package Java.Basics.OOPS.Polymorphism;

public class Final  {

    final void method(){
        System.out.println(" boom this method cannot be overridden ");
    }

    /*This method cannot be used in another class*/
    final void method(int c) {

        int a = 10;
        a=c;
        System.out.println(a);
    }

    public static void main(String args[]){


    }
}

// you cannot inherit the final class
final class fin extends Final{


}
