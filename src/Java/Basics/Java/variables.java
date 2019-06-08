package Java.Basics.Java;

public class variables {

    int number;

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String cat;
    final String food = "Idly";
    String water;

    public String getName() {
        return name;
    }


    //strictfp String mood="Happpy";
    enum vishnu {

    }

    public variables() {
        // num = name;
        System.out.println("the Number is " + name);
    }

    void catName() {
        // food="aaf";
        number = 10;
        name = "Burnos";
        cat = "Yellow";
        System.out.println("I have a cat named" + name + "it is " + number + "old and the color is " + cat);
    }

    public static void main(String arg[]) {

        variables ob = new variables();

        // variables o=new variables(5);
        //    subclass ob1 = new subclass();
        //ob.catName();
        ob.number = 5;
        //  ob1.catName();
        System.out.println();

    }
}

class subclass extends variables {

    void catName() {
        System.out.println();
    }
}