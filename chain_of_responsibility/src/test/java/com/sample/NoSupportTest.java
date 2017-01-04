package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class NoSupportTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	Support support;
	Trouble trouble;

	public void setUp() {
		System.setOut(new PrintStream(out));
		support = new NoSupport("ほげ");
	}

	public void testSupportFail() {
		trouble = new Trouble(0);
		support.support(trouble);
		assertTrue(out.toString().equals("[Trouble 0] cannot be resolved.\n"));
	}
}
