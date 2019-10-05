package Java.Advanced.Exceptions;

public class CustomExceptions extends Exception {

    public CustomExceptions(String s) throws Exception {

        // this super will get latest params of constructor
        super(s);
        System.out.println("hey dood! are you good ");

    }

    public static void main(String[] args) throws Exception {

        try {
            System.out.println();
            throw new CustomExceptions("This is custom created exception for some specific bussniess logic experience ");

        } catch (CustomExceptions e) {
            System.out.println(e);
        }

    }
}

