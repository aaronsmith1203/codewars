package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MrScroogeTest {

    @Test
    public void calculateYearsTest1() {
        /*
         * - Let P be the Principal = 1000.00
         * - Let I be the Interest Rate = 0.05
         * - Let T be the Tax Rate = 0.18
         * - Let D be the Desired Sum = 1100.00
         * After 1st Year --> P = 1041.00
         * After 2nd Year --> P = 1083.68
         * After 3rd Year --> P = 1128.30
         *
         * Thus Mr. Scrooge has to wait for 3 years (Y) for the initial
         * principal to amount to the desired sum.
         */

        final double PRINCIPAL = 1000.00d;
        final double INTEREST = 0.05d;
        final double TAX = 0.18d;
        final double DESIRED = 1100.00d;
        final int EXPECTED = 3;

        assertEquals(EXPECTED,
                MrScrooge.calculateYears(PRINCIPAL, INTEREST, TAX, DESIRED));
    }

    @Test
    public void calculateYearsTest2() {
        /*
         * - Let P be the Principal = 1000.00
         * - Let I be the Interest Rate = 0.01625
         * - Let T be the Tax Rate = 0.18
         * - Let D be the Desired Sum = 1200.00
         * 
         * Therefore, 14 years (Y) for the initial
         * principal (P) to amount to the desired sum (D).
         */

        final double PRINCIPAL = 1000.00d;
        final double INTEREST = 0.01625d;
        final double TAX = 0.18d;
        final double DESIRED = 1200.00d;
        final int EXPECTED = 14;

        assertEquals(EXPECTED,
                MrScrooge.calculateYears(PRINCIPAL, INTEREST, TAX, DESIRED));
    }

    @Test
    public void calculateYearsTest3() {
        /*
         * - Let P be the Principal = 1000.00
         * - Let I be the Interest Rate = 0.05
         * - Let T be the Tax Rate = 0.18
         * - Let D be the Desired Sum = 1000.00
         *
         * Y should be 0
         */

        final double PRINCIPAL = 1000.00d;
        final double INTEREST = 0.05d;
        final double TAX = 0.18d;
        final double DESIRED = 1000.00d;
        final int EXPECTED = 0;

        assertEquals(EXPECTED,
                MrScrooge.calculateYears(PRINCIPAL, INTEREST, TAX, DESIRED));
    }
}
