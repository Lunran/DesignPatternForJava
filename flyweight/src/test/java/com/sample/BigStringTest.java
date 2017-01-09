package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class BigStringTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void testPrint1() {
		new BigString("000", true).print();
		assertTrue(out.toString().equals("....######......\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n....######......\n................\n....######......\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n....######......\n................\n....######......\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n..##......##....\n....######......\n................\n"));
	}

	public void testPrint2() {
		new BigString("aaa", true).print();
		assertTrue(out.toString().equals("NullPointerException!\na?a?a?"));
	}

}
