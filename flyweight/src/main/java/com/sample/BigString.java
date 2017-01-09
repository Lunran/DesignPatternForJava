package com.sample;

public class BigString {

	private BigChar[] bigchars;

	public BigString(String string, boolean shared) {
		bigchars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i=0; i<bigchars.length; i++) {
			if (shared) {
				bigchars[i] = factory.getBigChar(string.charAt(i));
			}
			else {
				bigchars[i] = new BigChar(string.charAt(i));
			}
		}
	}

	public void print() {
		for (BigChar bigchar: bigchars) {
			bigchar.print();
		}
	}

}
