package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoundingTest {
    
    @Test
    public void roundToNext5BasicValidInputTests() {
        final int[] INPUT = {
            0, 2, 3, 12, 21, 30, -2, -5
        };
        final int[] EXPECTED = {
            0, 5, 5, 15, 25, 30, 0, -5
        };
        for (int i = 0; i < INPUT.length; i++) {
            assertEquals(EXPECTED[i], Rounding.roundToNext5(INPUT[i]));
        }
    }
}
