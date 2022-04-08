package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterTest {
	
	@Test
	public void printerErrorTest1() {
		// s="aaabbbbhaijjjm"
		// printer_error(s) => "0/14"
		
		assertEquals("0/14",Printer.printerError("aaabbbbhaijjjm"));
	}
	
	@Test
	public void printerErrorTest2() {
		// s="aaaxbbbbyyhwawiwjjjwwm"
		// printer_error(s) => "8/22"
		
		assertEquals("8/22",Printer.printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}
}
