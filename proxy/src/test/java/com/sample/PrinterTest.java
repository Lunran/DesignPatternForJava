package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class PrinterTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private Printable p;

	protected void setUp() throws Exception {
		super.setUp();
		System.setOut(new PrintStream(out));
	}

	public void testSetAndGetPrinterName1() {
		p = new Printer();
		p.setPrinterName("Alice");
		assertTrue(p.getPrinterName().equals("Alice"));
	}

	public void testSetAndGetPrinterName2() {
		p = new Printer("Alice");
		assertTrue(p.getPrinterName().equals("Alice"));
	}

	public void testPrint() {
		p = new Printer("Alice");
		p.print("Hello, world.");
		assertTrue(out.toString().equals("Printerのインスタンス(Alice)を生成中.....完了。\n=== Alice ===\nHello, world.\n"));
	}

}
