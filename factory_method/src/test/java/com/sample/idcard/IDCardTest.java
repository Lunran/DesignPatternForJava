package com.sample.idcard;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class IDCardTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	IDCard idCard;

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testUse() {
		IDCard idCard = new IDCard("test");
		idCard.use();
		StringBuilder sb = new StringBuilder("testのカードを使います。" + System.lineSeparator());
		assertTrue(out.toString().equals(sb.toString()));
	}
}
