package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class SideBorderTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	StringDisplay stringDisplay;
	SideBorder sideBorder;

	public void setUp() {
		System.setOut(new PrintStream(out));
		stringDisplay = new StringDisplay("Hello, world.");
		sideBorder = new SideBorder(stringDisplay, '*');
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testShow() {
		sideBorder.show();
		StringBuilder sb = new StringBuilder("*Hello, world.*\n");
		assertTrue(out.toString().equals(sb.toString()));
	}

	public void testGetColumns() {
		assertTrue(sideBorder.getColumns() == 15);
	}

	public void testGetRows() {
		assertTrue(sideBorder.getRows() == 1);
	}

	public void testGetRowText1() {
		assertTrue(sideBorder.getRowText(0).equals("*Hello, world.*"));
	}

	public void testGetRowText2() {
		assertTrue(sideBorder.getRowText(1).equals("*null*"));
	}

}
