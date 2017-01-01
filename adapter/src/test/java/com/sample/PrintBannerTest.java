package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class PrintBannerTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	PrintBanner printBanner;

	public void setUp() {
		System.setOut(new PrintStream(out));
		printBanner = new PrintBanner("test");
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testShowWithParen() {
		printBanner.showWithParen();
		assertTrue(out.toString().equals("{test}" + System.lineSeparator()));
	}

	public void testShowWithAster() {
		printBanner.showWithAster();
		assertTrue(out.toString().equals("*test*" + System.lineSeparator()));
	}
}
