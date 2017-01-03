package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class StringDisplayImplTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	StringDisplayImpl stringDisplayImpl;

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testOpen() {
		stringDisplayImpl = new StringDisplayImpl("Hello, World.");
		stringDisplayImpl.open();
		assertTrue(out.toString().equals("+-------------+\n"));
	}

	public void testPrint() {
		stringDisplayImpl = new StringDisplayImpl("Hello, World.");
		stringDisplayImpl.print();
		assertTrue(out.toString().equals("|Hello, World.|\n"));
	}

	public void testClose() {
		stringDisplayImpl = new StringDisplayImpl("Hello, World.");
		stringDisplayImpl.close();
		assertTrue(out.toString().equals("+-------------+\n"));
	}

}
