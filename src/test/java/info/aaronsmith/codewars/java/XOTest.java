package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class XOTest {

	@Test
	public void getXOTest1() {
		// XO("ooxx") => true

		final String INPUT = "ooxx";
		final boolean EXPECTED = true;

		boolean actual = XO.getXO(INPUT);
		assertEquals(EXPECTED, actual);
	}

	@Test
	public void getXOTest2() {
		// XO("xooxx") => false

		final String INPUT = "xooxx";
		final boolean EXPECTED = false;

		boolean actual = XO.getXO(INPUT);
		assertEquals(EXPECTED, actual);
	}

	@Test
	public void getXOTest3() {
		// XO("ooxXm") => true

		final String INPUT = "ooxXm";
		final boolean EXPECTED = true;

		boolean actual = XO.getXO(INPUT);
		assertEquals(EXPECTED, actual);
	}

	@Test
	public void getXOTest4() {
		// XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true

		final String INPUT = "zpzpzpp";
		final boolean EXPECTED = true;

		boolean actual = XO.getXO(INPUT);
		assertEquals(EXPECTED, actual);
	}

	@Test
	public void getXOTest5() {
		// XO("zzoo") => false

		final String INPUT = "zzoo";
		final boolean EXPECTED = false;

		boolean actual = XO.getXO(INPUT);
		assertEquals(EXPECTED, actual);
	}
}
