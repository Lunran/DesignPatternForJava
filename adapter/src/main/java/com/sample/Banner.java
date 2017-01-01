package com.sample;

public class Banner {

	private String string;

	public Banner (String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println(appendDelimiter("{", "}"));
	}

	public void showWithAster() {
		System.out.println(appendDelimiter("*", "*"));
	}

	private String appendDelimiter(String delimiter1, String delimiter2) {
		StringBuilder sb = new StringBuilder(delimiter1);
		return sb.append(string).append(delimiter2).toString();
	}
}
