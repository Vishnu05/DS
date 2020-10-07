package Java.Junit.Junit4.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageTest {

    String s = "hello junit";
    Message message = new Message(s);

    @Test
    public void printMessage() {
        assertEquals(s, message.printMessage());
    }
}