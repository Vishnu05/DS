package Java.Basics.Loops;

public class LoopsStatement {

    static void parameter(int n){

        int length=0;
        String string[]={"Java and its framework"};
        // Loops conditions inside a loop
        System.out.println(string.length);
        System.out.println(string.toString());
        for (int i=0;i<string.length;i++){

            System.out.println("String are "+string[i]);
        }

//        for (int i=0;string[i]!='\0';i++){
//            length++;
//        }

        for(int i=0;i<n;i=-1){

        }
        System.out.println("The length of the string is "+length);
    }
    public static void main (String [] args){

        parameter(5);
    }
}
