package com.sample;

public class StringDisplay extends AbstractDisplay {

	String string;

	public StringDisplay (String string) {
		this.string = string;
	}

	@Override
	public void open() {
		StringBuilder sb = new StringBuilder("+");
		for (int i=0; i<string.getBytes().length; i++) {
			sb.append("-");
		}
		sb.append("+");
		System.out.println(sb.toString());
	}

	@Override
	public void print() {
		StringBuilder sb = new StringBuilder("|");
		sb.append(string).append("|");
		System.out.println(sb.toString());
	}

	@Override
	public void close() {
		StringBuilder sb = new StringBuilder("+");
		for (int i=0; i<string.getBytes().length; i++) {
			sb.append("-");
		}
		sb.append("+");
		System.out.println(sb.toString());
	}
}
