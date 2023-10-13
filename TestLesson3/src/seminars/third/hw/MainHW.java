package seminars.third.hw;

// HW 3.1 tests

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilsTestOne {

    @Test
    public void testIsEven() {
        assertTrue(NumberUtils.isEven(2));
        assertFalse(NumberUtils.isEven(3));
        assertTrue(NumberUtils.isEven(0));
        assertFalse(NumberUtils.isEven(-1));
        assertTrue(NumberUtils.isEven(-4));
    }
}


// HW 3.2 tests

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void testIsInRange() {
        assertTrue(NumberUtils.isInRange(50));
        assertFalse(NumberUtils.isInRange(25));
        assertFalse(NumberUtils.isInRange(100));
        assertFalse(NumberUtils.isInRange(10));
        assertTrue(NumberUtils.isInRange(75));
    }
}