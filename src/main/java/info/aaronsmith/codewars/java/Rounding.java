package info.aaronsmith.codewars.java;

public class Rounding {

    /*
     *
     * Given an integer as input, can you round it to the next (meaning, "higher")
     * multiple of 5?
     *
     * Examples:
     *
     * input: output:
     * 0 -> 0
     * 2 -> 5
     * 3 -> 5
     * 12 -> 15
     * 21 -> 25
     * 30 -> 30
     * -2 -> 0
     * -5 -> -5
     *
     * Input may be any positive or negative integer (including 0).
     *
     * You can assume that all inputs are valid integers.
     * 
     * -----
     * PEDAC
     * -----
     * PROBLEM
     * round UP to nearest multiple of five. not down.
     * inputs:
     * - integer value to test (always valid)
     * outputs:
     * - integer value of next nearest multiple of five
     * rules/reqs:
     * - rounding up to next multiple of 5
     * - if already multiple of 5, do not round up, just return same value
     * 
     * EXAMPLES & TEST CASES
     * input to output:
     * - if input is multiple of five, output same value
     * - otherwise get remainder of division by 5
     * edge cases:
     * - already a multiple-of-five, take no action
     * - already know input data type is valid, and negative values should still
     * work
     * 
     * DATA STRUCTURES
     * - simple primitive integers in and out
     * 
     * ALGORITHM
     * - get modulus of input divided by 5 (0-4)
     * - return value of (input - remainder + 5)
     *   (input + (5 - remainder))
     * - find out how many away from multiple-of-five I am
     *   5 - mod5
     * 
     * ex 1) input = 2, output = 5
     * i need to add 3
     * remainder = 2 % 5 = 2
     * return (2 - 2 + 5) = 5
     *   
     * ex 2) input = 3, output = 5
     * i need to add 2
     * remainder = 3 % 5 = 3
     * return (9 - 4 + 5) = 10
     * 
     * ex 3) input = 30, output = 30
     * i need to add 0
     * remainder = 15 % 5 = 0
     * return (15 - 0 + 5)
     * 
     * ex 4) input = -3, output = 0
     * i need to add 3 
     * remainder = -3 % 5 = -3
     * return -3 -3 = 0
     * 
     */
    public static int roundToNext5(int number) {
        if (number % 5 == 0) return number;
        if (number > 0) {
            return (number - (number % 5) + 5);
        } else {
            return (number - (number % 5));
        }
    }
}
