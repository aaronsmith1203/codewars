package info.aaronsmith.codewars.java;

/* 
 *
 * Count the number of divisors of a positive integer n.
 *
 * dividend
 * --------
 *  divisor
 * 
 * Random tests go up to n = 500000.
 * 
 * 4 --> 3 (1, 2, 4)
 * 5 --> 2 (1, 5)
 * 12 --> 6 (1, 2, 3, 4, 6, 12)
 * 30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
 * 
 */
public class FindDivisor {
    public long numberOfDivisors(int n) {
        long numberOfDivisors = 0;

        // for every integer between 1 and the input value (`n`)
        for (int i = 1; i <= n; i++) {
            // it is a divisor if it divides into `n` without leaving a remainder 
            if (n % i == 0) numberOfDivisors++;
        }
        return numberOfDivisors;
    }
}
