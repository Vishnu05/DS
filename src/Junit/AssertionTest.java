package Junit;


import org.junit.Assert;
import org.junit.Test;

class AssertionTest {

    @Test
    public void strings () {
        String s = "Junit tutorials ";
        Assert.assertEquals("Junit tutorials", s);
    }

    public static void main(String[] args) {


    }
}

