package com.sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BookShelfTest extends TestCase {

	public BookShelfTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(BookShelfTest.class);
	}

	private BookShelf bookShelf;

	protected void setUp() {
		bookShelf = new BookShelf();
	}

	public void testCreate() {
		assertTrue(bookShelf.getLength() == 0);
		assertTrue(bookShelf.getBookAt(0) == null);
	}

	public void testAppendAndGet() {
		bookShelf.appendBook(new Book("Around the World"));
		assertTrue(bookShelf.getLength() == 1);
		assertTrue(bookShelf.getBookAt(0).getName().equals("Around the World"));
	}

	// TODO: add exceptional cases
}
