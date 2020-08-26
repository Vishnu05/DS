package Java.Basics.Basics;

public class This {

    int age;
    static String name;

    /**
     * with the help of this operator we can pass the values
     */
    void before(int age, String name) {
        System.out.println("Before this ->  " + age + name);
        this.age = age;
        this.name = name;
    }

    /**
     * this is inline comment
     */
    /*This(int age, String name) {
        this.age = age;
        this.name = name;
    }*/

    void after() {
        System.out.println("Before this ->  " + age + name);
    }


    public static void main(String args[]) {
        //  before();
        This obj = new This();
        obj.before(24, "vishnu");
        obj.after();


    }
}
