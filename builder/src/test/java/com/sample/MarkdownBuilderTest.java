package com.sample;

import junit.framework.TestCase;

public class MarkdownBuilderTest extends TestCase {

	MarkdownBuilder text_builder;

	public void setUp() {
		text_builder = new MarkdownBuilder();
	}

	public void testOpen() {
		text_builder.open("Greeting");
		assertTrue(text_builder.getResult().isEmpty());
	}

	public void testMakeTitle() {
		text_builder.makeHeadingLevel1("Greeting");
		assertTrue(text_builder.getResult().equals("# Greeting" + System.lineSeparator()));
	}

	public void testMakeString() {
		text_builder.makeHeadingLevel2("朝から昼にかけて");
		assertTrue(text_builder.getResult().equals("## 朝から昼にかけて" + System.lineSeparator()));
	}

	public void testMakeItems() {
		text_builder.makeItems(new String[] {"Good Morning", "こんにちは"});
		StringBuilder sb = new StringBuilder("- Good Morning" + System.lineSeparator());
		sb.append("- こんにちは" + System.lineSeparator());
		assertTrue(text_builder.getResult().equals(sb.toString()));
	}

	public void testClose() {
		text_builder.close();
		assertTrue(text_builder.getResult().isEmpty());
	}
}
