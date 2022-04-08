package info.aaronsmith.codewars.java;

/*
 * 
 * Check to see if a string has the same amount of 'x's and 'o's. 
 * The method must return a boolean and be case insensitive. 
 * The string can contain any char.
 * 
 * Example input/output:
 * 	 XO("ooxx") => true
 *   XO("xooxx") => false
 *   XO("ooxXm") => true
 *   XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 *   XO("zzoo") => false
 * 
 */
public class XO {

	public static boolean getXO(String str) {
		int numOfO = 0;
		int numOfX = 0;
		
		char[] strAsCharArray = str.toCharArray();
		for (int i = 0; i < strAsCharArray.length; i++) {
			
			char character = strAsCharArray[i];
			if (character == 'o' || character == 'O') {
				numOfO++;
			} 
			else if (character == 'x' || character == 'X') {
				numOfX++;
			}
		}
		return numOfO == numOfX;
	}
}
