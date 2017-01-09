package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class BigCharTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void testPrint1() {
		new BigChar('0').print();
		assertTrue(out.toString().equals("....######......\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n....######......\n................\n"));
	}

	public void testPrint2() {
		new BigChar('a').print();
		assertTrue(out.toString().equals("NullPointerException!\na?"));
	}

}
