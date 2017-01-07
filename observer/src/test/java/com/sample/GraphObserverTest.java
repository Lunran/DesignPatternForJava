package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class GraphObserverTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	Observer observer;
	NumberGenerator generator;

	public void setUp() {
		System.setOut(new PrintStream(out));
		observer = new GraphObserver();
		generator = new ConstantNumberGenerator();
		generator.generateNumber();
	}

	public void testUpdate() {
		observer.update(generator);
		assertTrue(out.toString().equals("GraphObserver: **********\n"));
	}

}
