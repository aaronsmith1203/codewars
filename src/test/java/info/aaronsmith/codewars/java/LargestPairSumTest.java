package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPairSumTest {

    @Test   
    public void pairSumTest1() {
        final int[] INPUT = {10, 14, 2, 23, 19};
        final int EXPECTED = 42; // 23 + 19

        assertEquals(EXPECTED, LargestPairSum.largestPairSum(INPUT));
    }

    @Test
    public void pairSumTest2() {
        final int[] INPUT = {99, 2, 2, 23, 19};
        final int EXPECTED = 122; // 99 + 23

        assertEquals(EXPECTED, LargestPairSum.largestPairSum(INPUT));
    }

    @Test
    public void pairSumTest3() {
        final int[] INPUT = {-99, 7, 0, 23, 2};
        final int EXPECTED = 30; // 7 + 23

        assertEquals(EXPECTED, LargestPairSum.largestPairSum(INPUT));
    }
}
