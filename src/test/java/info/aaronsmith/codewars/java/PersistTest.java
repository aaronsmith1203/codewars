package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersistTest {

	@Test
	public void multiplyDigitsTest1() {
		long input = 27L;
		long expected = 14L;
		long actual = Persist.multiplyDigits(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyDigitsTest2() {
		long input = 999L;
		long expected = 729L;
		long actual = Persist.multiplyDigits(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyDigitsTest3() {
		long input = 1111L;
		long expected = 1L;
		long actual = Persist.multiplyDigits(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyDigitsTest4() {
		long input = 909L;
		long expected = 0L;
		long actual = Persist.multiplyDigits(input);
		
		assertEquals(expected, actual);
	}
}
