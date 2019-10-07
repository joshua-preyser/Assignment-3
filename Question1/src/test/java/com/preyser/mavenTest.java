package com.preyser;

import static org.junit.Assert.*;

import javax.naming.AuthenticationException;

import org.junit.Ignore;
import org.junit.Test;

public class mavenTest
{
    //object equality
    @Test
    public void equalityTest()
    {
        assertEquals("5 should be equal to five", 5, 5);
    }

    // object identity
    @Test
    public void identityTest()
    {
        Object chris = new Object();
        assertSame("This should be the same object.", chris, chris);
    }

    // This should fail.
    @Test
    public void exceptionFailTest()
    {
        try{
            float result = 5/0;
fail("exception should have been thrown");
        }
        catch(ArithmeticException x)
        {
            // should fail
        }
        
    }

    //timeout
    @Test(timeout = 1000)
    public void TestTimeOut()
        {
            assertArrayEquals("Arrays should be equal.", new int[] {1,2}, new int[]{1,2});
        }
        //disable
        @Ignore
        @Test
        public void ignoreMe()
        {
            assertNull("This should evaluate to null.", null);
            assertFalse("This should evaluate to false.", false);
        }
}