package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class BannerTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	Banner banner;

	public void setUp() {
		System.setOut(new PrintStream(out));
		banner = new Banner("test");
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testShowWithParen() {
		banner.showWithParen();
		assertTrue(out.toString().equals("{test}" + System.lineSeparator()));
	}

	public void testShowWithAster() {
		banner.showWithAster();
		assertTrue(out.toString().equals("*test*" + System.lineSeparator()));
	}
}
