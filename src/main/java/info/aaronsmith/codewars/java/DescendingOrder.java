package info.aaronsmith.codewars.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

	public static int sortDesc(final int num) {
		
		List<Integer> digits = integerToIntegerList(num);
		
		Collections.sort(digits);
		Collections.reverse(digits);
		
		return Integer.parseInt(listToString(digits));
	}
	
	private static List<Integer> integerToIntegerList(int num) {
		List<Integer> digits = new ArrayList<Integer>();

		while (num > 0) {
			digits.add(num % 10);
			num = num / 10;
		}
		
		return digits;
	}
	
	private static String listToString(List<Integer> list ) {
		String result = "";
		for (int digit : list) {
			result += digit;
		}
		return result;
	}
}
