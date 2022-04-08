package info.aaronsmith.codewars.java;

public class Persist {
    public static int persistence(long n) {
        int iterations = 0;
        while (n > 9) {
            iterations++;
            n = multiplyDigits(n);
        }
        return iterations;
    }

    public static long multiplyDigits(long n) {
        if (n < 10) {
            return n;
        } else {
            long digit = n % 10;
            return digit * multiplyDigits(n / 10);
        }
    }
}