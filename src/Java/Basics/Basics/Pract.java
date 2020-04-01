package Java.Basics.Basics;

class Pract {

 /*   int a;
    String vishnu;

    void fun(){

        int b=5;
        int c;
        c=b+a;
        System.out.println(c);
        System.out.println(vishnu);

    }

    public static void main(String agrs[]){

        Pract o=new Pract();
        o.fun();
        System.out.println();
    }*/

    private int id;
    private String book;

    public int getID() {

        return id;
    }

    public void setId(int id1) {
        id = id1;
    }


    public class gofor {



    }

    public static void main(String args[]) {

        Pract ob = new Pract();
        ob.setId(541);
        System.out.println(ob.getID());
    }
}
