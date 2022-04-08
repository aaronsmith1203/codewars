package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void conversionTest1() {
		int input = 1666;
		String expected = "MDCLXVI";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest2() {
		int input = 2008;
		String expected = "MMVIII";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest3() {
		int input = 1990;
		String expected = "MCMXC";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest4() {
		int input = 40;
		String expected = "XL";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest5() {
		int input = 400;
		String expected = "CD";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest6() {
		int input = 499;
		String expected = "CDXCIX";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest7() {
		int input = 4000;
		String expected = "MMMM";
		String actual = RomanNumerals.conversion(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conversionTest8() {
		int[] inputValue  = {     499,  400};
		String[] expected = {"CDXCIX", "CD"};
		
		for (int i = 0; i < expected.length; i++) {
			String actual = RomanNumerals.conversion(inputValue[i]);
			assertEquals(expected[i], actual);
		}
	}
}
