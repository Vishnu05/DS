package Java.Advanced.StringBuffer;

public class Stringbuffer {

    public static void main(String args[]){
        String buff = "buffer reader";
        StringBuilder ob1 = new StringBuilder();
        ob1.append(buff);
        ob1.reverse();
        System.out.println(ob1);
    }
}
