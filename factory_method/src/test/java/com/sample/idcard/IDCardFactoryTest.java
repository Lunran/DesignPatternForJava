package com.sample.idcard;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class IDCardFactoryTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	IDCardFactory idCardFactory;

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testCreate() {
		IDCardFactory idCardFactory = new IDCardFactory();
		idCardFactory.create("test");
		StringBuilder sb = new StringBuilder("testのカードを作ります。" + System.lineSeparator());
		assertTrue(out.toString().equals(sb.toString()));
	}
}
