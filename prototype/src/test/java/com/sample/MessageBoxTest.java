package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class MessageBoxTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	MessageBox messageBox;

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testUse() {
		messageBox = new MessageBox('*');
		messageBox.use("Hello, world.");
		StringBuilder sb = new StringBuilder("*****************" + System.lineSeparator());
		sb.append("* Hello, world. *" + System.lineSeparator());
		sb.append("*****************" + System.lineSeparator());
		assertTrue(out.toString().equals(sb.toString()));
	}
}
