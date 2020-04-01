package Java.Basics.Learning;

public class Static {

    // static will first start to execute the program first and then rest will execute
    static a ob = new a();

    static {
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("4");
    }
}

class a {

    static {
        System.out.println("1");
        System.out.println("2");
    }
}