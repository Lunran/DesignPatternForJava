package com.sample;

public abstract class Entry {

	String name;

	public String getName() {
		return name;
	}

	public abstract int getSize();

	public void add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	@Override
	public String toString() {
		return getName() + " ("+ getSize() + ")";
	}

}
