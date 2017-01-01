package com.sample;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

	private List<Book> books;
	private int last = 0;

	public BookShelf() {
		this.books = new ArrayList<Book>();
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	public Book getBookAt(int index) {
		if (index >= last) {
			return null;
		}
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}
}
