package edu.ucsd.cse110.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void testNull() {
        assertEquals(0, Utils.toIntNullSafe(null));
    }

    @Test
    public void testNotNull() {
        assertEquals(123, Utils.toIntNullSafe("123"));
    }

}