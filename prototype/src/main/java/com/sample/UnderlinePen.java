package com.sample;

import com.sample.framework.Product;

public class UnderlinePen extends Product {

	private char decochar;

	public UnderlinePen(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String string) {
		StringBuilder sb = new StringBuilder("*");
		System.out.println(sb.append(string).append("*").toString());
		sb = new StringBuilder(" ");
		for (int i=0; i<string.getBytes().length; i++) {
			sb.append(decochar);
		}
		sb.append(" ");
		System.out.println(sb.toString());
	}
}
