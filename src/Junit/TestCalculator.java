package Junit;

import DataStructure_and_Algorithm.Problems.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator extends Calculator {

    Calculator ob = new Calculator();

    @Test
    public void testAdd() {

        assertEquals(5, ob.add(2, 3));
    }

    @Test
    public void testSub() {

        assertEquals(5, ob.sub(10, 5));
    }

    @Test
    public void testMul() {
        assertEquals(0, ob.mul(0, 2));

    }

    @Test
    public void testDivide() {
        assertEquals(4, ob.divide(16, 4));
    }
}
