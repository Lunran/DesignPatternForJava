package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class BigCharFactoryTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	BigCharFactory bigcharfactory;

	public void setUp() {
		System.setOut(new PrintStream(out));
		bigcharfactory = BigCharFactory.getInstance();
	}

	public void testGet1() {
		BigChar c1 = bigcharfactory.getBigChar('0');
		BigChar c2 = bigcharfactory.getBigChar('0');
		assertTrue(c1 != null);
		assertTrue(c1 == c2);
	}

	// FIXME: Don't cache an unnecessary character
	public void testGet2() {
		BigChar c1 = bigcharfactory.getBigChar('a');
		BigChar c2 = bigcharfactory.getBigChar('a');
		assertTrue(c1 != null);
		assertTrue(c1 == c2);
	}

}
