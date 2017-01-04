package com.sample;

import java.util.Iterator;

public abstract class Entry implements Element {

	String name;

	public String getName() {
		return name;
	}

	public abstract int getSize();

	public void add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public Iterator<Entry> iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	@Override
	public String toString() {
		return getName() + " ("+ getSize() + ")";
	}

}
