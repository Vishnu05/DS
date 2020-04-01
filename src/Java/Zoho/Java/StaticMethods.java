package Java.Basics.Java;

public class StaticMethods {
     static int temp;
    static void fun(int a,int b){
          temp=a+b;

    }
    static void display( ){
        System.out.println(temp);
    }
    public static void main(String[] args){

        fun(2,4);
        display();
    }
}
