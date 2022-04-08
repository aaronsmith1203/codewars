package info.aaronsmith.codewars.java;

public class Printer {

	public static String printerError(String s) {
		int numberOfErrors = 0;
		
		for (int i = 0; i < s.length(); i++) {
			// valid errors ASCII: 97-109 (a-m)
			int asciiValue = s.charAt(i);
			if (asciiValue < 97 || 
					asciiValue > 109) {
				numberOfErrors++;
			}
		}
		return numberOfErrors + "/" + s.length();
	}
}
