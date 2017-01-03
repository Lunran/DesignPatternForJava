package com.sample;

/**
 * Root class of functional hierarchy
 * (This is not an abstract class!)
 *
 */
public class Display {

	DisplayImpl displayImpl;

	public Display(DisplayImpl displayImpl) {
		this.displayImpl = displayImpl;
	}

	public void display() {
		open();
		print();
		close();
	}

	protected void open() {
		displayImpl.open();
	}

	protected void print() {
		displayImpl.print();
	}

	protected void close() {
		displayImpl.close();
	}

}
