package com.sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BookShelfIteratorTest extends TestCase {

	public BookShelfIteratorTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(BookShelfIteratorTest.class);
	}

	private BookShelfIterator bookShelfIterator;
	private BookShelf bookShelf;

	protected void setUp() {
		bookShelf = new BookShelf();
	}

	public void testCreateEmpty() {
		bookShelfIterator = new BookShelfIterator(bookShelf);
		assertTrue(bookShelfIterator.hasNext() == false);
		assertTrue(bookShelfIterator.next() == null);
	}

	public void testCreateOne() {
		bookShelf.appendBook(new Book("Around the World"));
		bookShelfIterator = new BookShelfIterator(bookShelf);
		assertTrue(bookShelfIterator.hasNext() == true);

		Book book = bookShelfIterator.next();
		assertTrue(book.getName().equals("Around the World"));

		assertTrue(bookShelfIterator.hasNext() == false);
	}

	// TODO: add exceptional cases
}
