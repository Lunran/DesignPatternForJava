package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class StringDisplayTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	StringDisplay stringDisplay;

	public void setUp() {
		System.setOut(new PrintStream(out));
		stringDisplay = new StringDisplay("Hello, world.");
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testShow() {
		stringDisplay.show();
		StringBuilder sb = new StringBuilder("Hello, world.\n");
		assertTrue(out.toString().equals(sb.toString()));
	}

	public void testGetColumns() {
		assertTrue(stringDisplay.getColumns() == 13);
	}

	public void testGetRows() {
		assertTrue(stringDisplay.getRows() == 1);
	}

	public void testGetRowText1() {
		assertTrue(stringDisplay.getRowText(0) == "Hello, world.");
	}

	public void testGetRowText2() {
		assertTrue(stringDisplay.getRowText(1) == null);
	}

}
