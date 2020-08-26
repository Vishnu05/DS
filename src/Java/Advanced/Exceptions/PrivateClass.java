package Java.Advanced.Exceptions;

public class PrivateClass {

    int age;
    private String name;
    public String country;

    public static void main(String args[]) {
        normal ob = new normal();
        ob.form(1, "india");

    }

    private class privateClass  extends  PrivateClass{

    }
}

 class normal extends PrivateClass {

    public void form(int age, String country) {
        System.out.println(age + " " + country);
    }

}
