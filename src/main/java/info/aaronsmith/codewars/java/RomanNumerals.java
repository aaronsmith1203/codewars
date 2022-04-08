package info.aaronsmith.codewars.java;

/*
 * Create a function taking a positive integer as its parameter and returning 
 * a string containing the Roman Numeral representation of that integer.
 * 
 * Symbol    Value
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1,000
 * 
 * There can not be more than three of the same character consecutively.
 * - This means that 4 is not `IIII`, but is `IV` (-1 + 5)
 * - This means that 40 is not `XXXX`, but `XL` (-10 + 50)
 * - This means that 400 is not `CCCC`, but `CD` (-)
 */
public class RomanNumerals {

	// declared in reverse as we want to iterate in reverse order
    static int[] numeralValues     = { 1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,  1  };
    static String[] numeralSymbols = {  "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String conversion(int n) {
    	StringBuilder output = new StringBuilder();
    	
    	for (int i = 0; i < numeralValues.length; i++) {		
    		if (n == 0) break;
    		
    		int quotient  = n / numeralValues[i];
    		int remainder = n % numeralValues[i];
    		
			for (int x = 0; x < quotient; x++) {
				output.append(numeralSymbols[i]);
			}
			n = remainder;
    	}
        return output.toString();
    }
}
