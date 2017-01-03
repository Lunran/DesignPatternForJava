package com.sample;

public class StringDisplayImpl extends DisplayImpl {

	String string;

	public StringDisplayImpl(String string) {
		this.string = string;
	}

	@Override
	public void open() {
		printLineSeparater(string);
	}

	@Override
	public void print() {
		StringBuilder sb = new StringBuilder("|");
		sb.append(string);
		sb.append("|");
		System.out.println(sb.toString());
	}

	@Override
	public void close() {
		printLineSeparater(string);
	}

	private void printLineSeparater(String string) {
		StringBuilder sb = new StringBuilder("+");
		for (int i=0; i<string.getBytes().length; i++) {
			sb.append("-");
		}
		sb.append("+");
		System.out.println(sb.toString());
	}
}
