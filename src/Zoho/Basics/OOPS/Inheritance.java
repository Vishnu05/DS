package Zoho.Basics.OOPS;



class House {

    String window;
    String rack;
    String fridge;

    void secondfloor(String windows) {
        windows = window;
        System.out.println("House contains 2 " + window + "and there is a " + fridge);
    }
}

public class Inheritance extends House {

    void firstfloor() {

        Inheritance ob=new Inheritance();

        System.out.println(window + "" + rack);
    }

    public static void main(String args[]) {

        House ob = new House();
        ob.secondfloor("Vishnu");
    }
}



