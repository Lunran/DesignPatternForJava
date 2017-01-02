package com.sample;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.open("Greeting");
		builder.makeHeadingLevel1("Greeting");
		builder.makeHeadingLevel2("朝から昼にかけて");
		builder.makeItems(new String[] {"Good Morning", "こんにちは"});
		builder.close();
	}

}
