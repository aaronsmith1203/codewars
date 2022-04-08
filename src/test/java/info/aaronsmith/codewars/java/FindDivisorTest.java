package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindDivisorTest {

    @Test
    public void numberOfDivisorsTest1() {

        final int INPUT = 30;
        final long EXPECTED = 8;

        FindDivisor fd = new FindDivisor();
        assertEquals(EXPECTED, fd.numberOfDivisors(INPUT));
    }

    @Test
    public void numberOfDivisorsTest2() {

        final int INPUT = 12;
        final long EXPECTED = 6;

        FindDivisor fd = new FindDivisor();
        assertEquals(EXPECTED, fd.numberOfDivisors(INPUT));
    }

    @Test
    public void numberOfDivisorsTest3() {

        final int INPUT = 5;
        final long EXPECTED = 2;

        FindDivisor fd = new FindDivisor();
        assertEquals(EXPECTED, fd.numberOfDivisors(INPUT));
    }

    @Test
    public void numberOfDivisorsTest4() {

        final int INPUT = 1;
        final long EXPECTED = 1;

        FindDivisor fd = new FindDivisor();
        assertEquals(EXPECTED, fd.numberOfDivisors(INPUT));
    }
}
