package info.aaronsmith.codewars.java;

public class HumanReadableTime {

/*
 * Write a function, which takes a non-negative integer (seconds)
 * as input and returns the time in a human-readable format (HH:MM:SS)
 * - HH = hours, padded to 2 digits, range: 00 - 99
 * - MM = minutes, padded to 2 digits, range: 00 - 59
 * - SS = seconds, padded to 2 digits, range: 00 - 59
 * 
 * The maximum time never exceeds 359999 (99:59:59)
 */

/*
 * PEDAC
 * PROBLEM
 * input: 'seconds' as non-negative integer (0-359999)
 * output: string representation of time in format (HH:MM:SS)
 * rules/reqs: HH hours, MM minutes, SS seconds
 * - pad single digits to double-digits (2 -> 02)
 * EXAMPLES
 * 0 -> 00:00:00
 * 5 -> 00:00:05
 * 60 -> 00:01:00
 * 359999 -> 99:59:59
 * edge cases: we know that 359999 is maximum input
 * DATA STRUCTURES
 * - int input, String output
 * - DateTime class?? or own implementation?
 * ALGORITHM
 * - get fractional seconds from input in range (0-59)
 *     modularSeconds = seconds % 60
 * - get fractional minutes from input in range (0-59)
 *     totalMinutes = seconds / 60;
 *     modularMinutes = totalMinutes % 60
 * - get fractional hours in range (0-99)
 *     totalHours = seconds / 3600;
 * - concatenate values to string with separators (or join)
 */

    public static String makeReadable(int seconds) {
        int hrs = (int)(seconds / 3600);
        int mins = (int)(seconds / 60) % 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hrs, mins, secs);
    }

}