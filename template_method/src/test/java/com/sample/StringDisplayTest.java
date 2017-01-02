package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class StringDisplayTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	StringDisplay stringDisplay;

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testDisplay1() {
		stringDisplay = new StringDisplay("test");
		stringDisplay.display();
		StringBuilder sb = new StringBuilder("+----+" + System.lineSeparator());
		for (int i=0; i<5; i++) {
			sb.append("|").append("test").append("|" + System.lineSeparator());
		}
		sb.append("+----+" + System.lineSeparator());
		assertTrue(out.toString().equals(sb.toString()));
	}

	public void testDisplay2() {
		// FIXME: getByte().length does not return what we want
		stringDisplay = new StringDisplay("てすと");
		stringDisplay.display();
		StringBuilder sb = new StringBuilder("+---------+" + System.lineSeparator());
		for (int i=0; i<5; i++) {
			sb.append("|").append("てすと").append("|" + System.lineSeparator());
		}
		sb.append("+---------+" + System.lineSeparator());
		assertTrue(out.toString().equals(sb.toString()));
	}
}
