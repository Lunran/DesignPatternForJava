package com.sample;

import java.util.Iterator;

public class ListVisitor extends Visitor {

	private String currentdir = "";

	/**
	 * delegated method from File
	 * @param file target instance of File
	 */
	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	/**
	 * delegated method from Directory
	 * @param directory target instance of Directory
	 */
	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
