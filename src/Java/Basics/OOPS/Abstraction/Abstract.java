package Java.Basics.OOPS.Abstraction;

public abstract class Abstract {

    int a;

    void abmethod() {
        System.out.println("This is abstract method and we can access with anonymous class");
    }
}

class subclass extends Abstract {

    public static void main(String args[]) {

        Abstract ob = new Abstract() {};
        ob.abmethod();
    }
}

abstract class interfaces implements Interface {

//    public void func() {
//    }

    public void char_sum() {

        System.out.println(b);
    }

    public void parsing() {

    }
}