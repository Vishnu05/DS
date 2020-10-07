package Java.Junit.Junit4;

import junit.framework.TestCase;

public class JavaTest extends TestCase {

    protected int value1, value22;

    @Override
    protected void setUp() throws Exception {
        value1 = 5;
        value22 = 4;
    }

    public void testAdd() {
        double result = value1 + value22;
        assertTrue(result == 19);
    }
}
