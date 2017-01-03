package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	List<Entry> contents = new ArrayList<Entry>();

	public Directory(String name) {
		this.name = name;
	}

	public int getSize() {
		int size = 0;
		Iterator<Entry> it = contents.iterator();
		while (it.hasNext()) {
			size += it.next().getSize();
		}
		return size;
	}

	@Override
	public void add(Entry entry) throws FileTreatmentException {
		contents.add(entry);
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = contents.iterator();
		while (it.hasNext()) {
			it.next().printList(prefix + "/" + name);
		}
	}

}
