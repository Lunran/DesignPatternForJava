package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	List<Entry> contents = new ArrayList<>();

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
	public Iterator<Entry> iterator() {
		return contents.iterator();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
