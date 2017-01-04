package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class SpecialSupportTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	Support support;
	Trouble trouble;

	public void setUp() {
		System.setOut(new PrintStream(out));
		support = new SpecialSupport("ほげ", 100);
	}

	public void testSupportFail1() {
		trouble = new Trouble(0);
		support.support(trouble);
		assertTrue(out.toString().equals("[Trouble 0] cannot be resolved.\n"));
	}

	public void testSupportSucceed() {
		trouble = new Trouble(100);
		support.support(trouble);
		assertTrue(out.toString().equals("[Trouble 100] is resolved by [ほげ].\n"));
	}

	public void testSupportFail2() {
		trouble = new Trouble(200);
		support.support(trouble);
		assertTrue(out.toString().equals("[Trouble 200] cannot be resolved.\n"));
	}
}
