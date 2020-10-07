package Java.Junit.Junit4.Example;

public class Message {

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
