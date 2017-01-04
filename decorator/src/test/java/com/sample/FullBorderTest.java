package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class FullBorderTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	StringDisplay stringDisplay;
	FullBorder fullBorder;

	public void setUp() {
		System.setOut(new PrintStream(out));
		stringDisplay = new StringDisplay("Hello, world.");
		fullBorder = new FullBorder(stringDisplay);
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testShow() {
		fullBorder.show();
		StringBuilder sb = new StringBuilder("+-------------+\n");
		sb.append("|Hello, world.|\n");
		sb.append("+-------------+\n");
		assertTrue(out.toString().equals(sb.toString()));
	}

	public void testGetColumns() {
		assertTrue(fullBorder.getColumns() == 15);
	}

	public void testGetRows() {
		assertTrue(fullBorder.getRows() == 3);
	}

	public void testGetRowText0() {
		assertTrue(fullBorder.getRowText(0).equals("+-------------+"));
	}

	public void testGetRowText1() {
		assertTrue(fullBorder.getRowText(1).equals("|Hello, world.|"));
	}

	public void testGetRowText2() {
		assertTrue(fullBorder.getRowText(2).equals("+-------------+"));
	}

	/**
	 * FIXME: Is this what you want?
	 *
	 */
	public void testGetRowText3() {
		assertTrue(fullBorder.getRowText(3).equals("|null|"));
	}

}







