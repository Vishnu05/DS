package Java.Advn.Exception;

public class AlexNotFoundException extends Exception {

    public AlexNotFoundException(String message) {
        super(message);
    }

    static void fun() throws AlexNotFoundException {
        throw new AlexNotFoundException("Alex is Maria");
    }

    public static void main(String[] args) throws Exception {

        fun();
        System.out.println();

    }

}
