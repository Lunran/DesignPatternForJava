package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class DigitObserverTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	Observer observer;
	NumberGenerator generator;

	public void setUp() {
		System.setOut(new PrintStream(out));
		observer = new DigitObserver();
		generator = new ConstantNumberGenerator();
		generator.generateNumber();
	}

	public void testUpdate() {
		observer.update(generator);
		assertTrue(out.toString().equals("DigitObserver: 10\n"));
	}

}
