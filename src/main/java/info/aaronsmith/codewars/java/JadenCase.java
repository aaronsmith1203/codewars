package info.aaronsmith.codewars.java;

/*
 * Example:
 *   Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 *   Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * 
 * Note that the Java version expects a return value of null for an empty string or null.
 */

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase.isBlank() || phrase == null) return null;

        String[] wordArray = phrase.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            Character firstChar = wordArray[i].charAt(0);
            wordArray[i] = wordArray[i].replaceFirst(
                String.valueOf(firstChar), 
                String.valueOf(Character.toUpperCase(firstChar))
            );
        }
        return String.join(" ", wordArray);
    }
}
