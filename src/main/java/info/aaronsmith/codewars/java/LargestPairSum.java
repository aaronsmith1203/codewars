package info.aaronsmith.codewars.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *
 * Given a sequence of numbers, find the largest pair sum in the sequence.
 *
 * For example
 *   [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
 *   [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
 *
 * Input sequence contains minimum two elements and every element is an integer.
 *
 */

/*
 *
 * PEDAC method
 * ------------
 * PROBLEM
 * - input: array of integers
 * - output: integer value which is the sum of the two largest input values
 * - rules/requirements
 *   - input array will always have a minimum of two integer values
 *   - input will only have integer values
 * EXAMPLES
 * - how does input turn to output?
 *   - the two largest integer values in input are found and added together
 * - edge cases
 *   - negative or zero integers - should be fine as they can still be summed to produce a value for comparison
 *   - input will always produce at least one summed value
 * DATA STRUCTURES
 * - primitive arrays and integers
 * - need to sort, so a List implementation
 * ALGORITHM #1
 * - convert array to ArrayList
 *   - initialise an empty ArrayList
 *   - iterate through values of input array and add to Arraylist
 * - sort ArrayList from largest to smallest (reverse order)
 * - add 1st and 2nd integer values for largestPairSum
 * - return largestPairSum
 * CODE FOLLOWS
 *
 */

public class LargestPairSum {
    public static int largestPairSum(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        list.sort(Collections.reverseOrder());
        return list.get(0) + list.get(1);
    }
}
