package Junit.Junit5;

import Junit.Class.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

class CalculatorTest {

    //bad way of doing this. when ever a method get executed a new instance is created ??? need refactor
    Calculator cal = new Calculator();

    @Test
    void sout() {
        System.out.println("Sample test case");
    }

    @Test
    void addTest() {
        int expected = 4;
        int actual = cal.add(2, 2);
        //assertEquals(expected, actual);
//        message : when test case fails it shows the message like println
        assertEquals("'Add method ' : wrong  ", 12, cal.add(2, 10));
    }

    @Test
    public void divTest() {
        assertThrows(ArithmeticException.class, () -> cal.div(0, 0), ") can't be divided by 0");
        //assertEquals("0 can't de divided",0,cal.div(1,0));
    }

    @Test
    void assertArray() {
        Assert.assertArrayEquals(new int[]{1, 2}, cal.arrays());
    }

    @Test
    void testTDD() {
        assertEquals("String has to be unique", "Vishnu", cal.TDD("Vishnu"));

    }

    @Test
    void fails() {
        try {
            //  fail("Unit case fails");
        } catch (Exception e) {
            System.out.println("Will the test can be handled ? : Yes ");
        }
    }

}