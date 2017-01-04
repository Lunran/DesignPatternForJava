package com.sample;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

public class DirectoryTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	File file;
	Directory directory;

	public void setUp() {
		System.setOut(new PrintStream(out));
		file = new File("ほげ", 1000);
		directory = new Directory("ぴよ");
	}

	public void tearDown() {
		System.setOut(null);
	}

	public void testSize1() {
		assertTrue(directory.getSize() == 0);
	}

	public void testSize2() {
		try {
			directory.add(file);
		}
		catch (FileTreatmentException fte) {
			fte.printStackTrace();
		}
		assertTrue(directory.getSize() == 1000);
	}

	public void testAccept1() {
		directory.accept(new ListVisitor());
		assertTrue(out.toString().equals("/ぴよ (0)\n"));
	}

	public void testAccept2() {
		try {
			directory.add(file);
		}
		catch (FileTreatmentException fte) {
			fte.printStackTrace();
		}
		directory.accept(new ListVisitor());
		assertTrue(out.toString().equals("/ぴよ (1000)\n/ぴよ/ほげ (1000)\n"));
	}
}
