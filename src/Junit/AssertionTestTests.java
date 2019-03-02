package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTestTests extends AssertionTest{
    
    String s="Junit tutorials ";
    @Test
    public void strings(){
        assertEquals("Junit tutorials ",s);
    }

}