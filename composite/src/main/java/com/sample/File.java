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
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}

}
