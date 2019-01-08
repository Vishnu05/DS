package Java.Basics.OOPS;

class Home {
 static int persons =5;

 static {

     persons= persons++ - --persons;
     System.out.println("Level one "+persons);


 }
}

class Rooms extends Home {
    static{


    }
}

public class Main {

    public static void main(String args[]) {

        Rooms obj=new Rooms();
    }
}
