package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HumanReadableTimeTest {

    @Test
    public void makeReadableTest() {
        final Map<Integer,String> TEST_CASES = new HashMap<>();
        // contains (input, expected output)
        TEST_CASES.put(0, "00:00:00");
        TEST_CASES.put(5, "00:00:05");
        TEST_CASES.put(60, "00:01:00");
        TEST_CASES.put(65, "00:01:05");
        TEST_CASES.put(3599, "00:59:59");
        TEST_CASES.put(3600, "01:00:00");
        TEST_CASES.put(3605, "01:00:05");
        TEST_CASES.put(3665, "01:01:05");
        TEST_CASES.put(86399, "23:59:59");
        TEST_CASES.put(86400, "24:00:00");
        TEST_CASES.put(359999, "99:59:59");
        for (final Integer INPUT : TEST_CASES.keySet()) {
            final String EXPECTED = TEST_CASES.get(INPUT);
            assertEquals(EXPECTED, HumanReadableTime.makeReadable(INPUT));
        }
    }
}
