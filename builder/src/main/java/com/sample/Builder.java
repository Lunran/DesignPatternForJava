package com.sample;

public abstract class Builder {

	StringBuilder result = new StringBuilder();

	String getResult() {
		return result.toString();
	}

	public abstract void open(String title);
	public abstract void makeHeadingLevel1(String title);
	public abstract void makeHeadingLevel2(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
