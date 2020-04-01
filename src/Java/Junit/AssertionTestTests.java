package Java.Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTestTests extends AssertionTest{
    
    String s="Java.Junit tutorials ";
    @Test
    public void strings(){
        assertEquals("Java.Junit tutorials ",s);
    }

}