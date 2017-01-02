package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class CharDisplayTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	CharDisplay charDisplay;

	public void setUp() {
		System.setOut(new PrintStream(out));
		charDisplay = new CharDisplay('a');
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testDisplay() {
		charDisplay.display();
		assertTrue(out.toString().equals("<<aaaaa>>" + System.lineSeparator()));
	}
}
