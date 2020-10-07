package Java.Junit.Junit4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnit {

    // basic test cases
    @Test
    public void test() {
        String s = "test";
        assertEquals("tests", s);
    }

    @Test
    public void add() {
        int a = 5, b = 10;
        int c = a + b;
        assertEquals(a + b, c);
    }
}
