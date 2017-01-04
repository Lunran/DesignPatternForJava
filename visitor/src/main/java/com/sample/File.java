package com.sample;

public class File extends Entry {

	int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
