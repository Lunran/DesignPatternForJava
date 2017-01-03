package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class FileTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	File file;

	public void setUp() {
		System.setOut(new PrintStream(out));
		file = new File("ほげ", 1000);
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testSize() {
		assertTrue(file.getSize() == 1000);
	}

	public void testPrintList() {
		file.printList();
		assertTrue(out.toString().equals("/ほげ (1000)\n"));
	}

	public void testAdd() {
		try {
			file.add(file);
			fail();
		}
		catch (FileTreatmentException expected) {
			assertTrue(true);
		}
	}
}
