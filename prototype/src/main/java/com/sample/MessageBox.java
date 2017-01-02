package com.sample;

import com.sample.framework.Product;

public class MessageBox extends Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String string) {
		printLineSeparater(string);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(decochar).append(" ").append(string).append(" ").append(decochar).toString());
		printLineSeparater(string);
	}

	private void printLineSeparater(String string) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<string.getBytes().length + 4; i++) {
			sb.append(decochar);
		}
		System.out.println(sb.toString());
	}
}
