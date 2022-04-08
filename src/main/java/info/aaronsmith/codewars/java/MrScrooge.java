package info.aaronsmith.codewars.java;

/*
 * Mr. Scrooge has a sum of money 'P' that he wants to invest.
 * Before he does, he wants to know how many years 'Y' this
 * sum 'P' has to be kept in the bank in order for it to amount
 * to a desired sum of money 'D'.
 *
 * The sum is kept for 'Y' years in the bank where interest 'I'
 * is paid yearly. After paying taxes 'T' for the year the new
 * sum is re-invested.
 *
 * Note to Tax: not the invested principal is taxed, but only
 * the year's accrued interest
 *
 * Your task is to complete the method provided and return the
 * number of years 'Y' as a whole in order for Mr. Scrooge to
 * get the desired sum.
 *
 * Assumption: Assume that Desired Principal 'D' is always
 * greater than the initial principal. However it is best to
 * take into consideration that if Desired Principal 'D' is
 * equal to Principal 'P' this should return 0 Years.
 */

/*
 * PEDAC
 * -----
 * PROBLEM
 * input:
 * - Principal Amount (P) 
 * - Desired Amount (D)
 * - Interest Rate (I)
 * - Tax Rate (T)
 * output:
 * - Years (Y)
 * rules/reqs:
 * - principal amount is invested at beginning of year
 * - interest is applied at the end of the year
 * - the amount of interest earned is taxed, not principal amount
 * - new principal amount is invested for the year
 * - return number of years as a _whole_ number
 * question:
 * - is amount rounded to 2dp yearly? or not at all?
 * EXAMPLES/TEST-CASES
 * - example cases are in `MrScroogeTest` class
 * edge cases:
 * - a maximum number of years for unattainable amounts: 99? assume
 *   that this isn't required for this exercise
 * - if principal and desired are equal, result is 0
 * ALGORITHM
 * - initialise `years` as 0
 * - begin while loop - test that `principal` is less-than `desired`
 * -          in loop - increment years by 1 (a year passes)
 * -          in loop - calculate new `principal` value to invest
 *                      interest = `principal` * `interestRate`
 *                      increase to amount = `interest` * (1.0 - `taxRate`)
 *                      `principal` = `principal` + (`interest` * (1.0 - `taxRate`))
 * - return `years`
 */

public class MrScrooge {

    public static int calculateYears(
            double principal, double interestRate,
            double taxRate, double desired) {
        int years = 0;
        while (principal < desired) {
            years++;
            principal = principal + (principal * interestRate * (1.0-taxRate));
        }
        return years;
    }

}
