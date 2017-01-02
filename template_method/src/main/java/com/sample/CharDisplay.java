package com.sample;

public class CharDisplay extends AbstractDisplay {

	char character;

	public CharDisplay (char character) {
		this.character = character;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(character);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}
}
