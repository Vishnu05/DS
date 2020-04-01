package Java.Basics.Learning;

class Super {

    int id;
    String name;
    boolean status;

    Super(int id, String name, boolean stat) {
        System.out.println("id: " + id + " name: " + name + " status: " + stat);
    }

    void mymethod() {
        System.out.println("Hi");
    }
}

class sub extends Super {

    sub(int a, String b, boolean c) {
        super(a, b, c); //tricky ?
        //if there is constructor in parent class(with arguments) why we need constructor in base class
        super.mymethod();
    }
}

public class inherit {

    public static void main(String[] args) {

        sub ob = new sub(1, "vishnu", true);
    }
}

