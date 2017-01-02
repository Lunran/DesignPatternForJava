package com.sample;

import junit.framework.TestCase;

public class HTMLBuilderTest extends TestCase {

	HTMLBuilder html_builder;

	public void setUp() {
		html_builder = new HTMLBuilder();
	}

	public void testOpenAndClose() {
		html_builder.open("Greeting");
		StringBuilder sb = new StringBuilder("<html><head><title>Greeting</title></head><body>" + System.lineSeparator());
		assertTrue(html_builder.getResult().equals(sb.toString()));

		html_builder.close();
		sb.append("</body></html>" + System.lineSeparator());
		assertTrue(html_builder.getResult().equals(sb.toString()));
	}

	public void testMakeTitle() {
		html_builder.makeHeadingLevel1("Greeting");
		StringBuilder sb = new StringBuilder("<h1>Greeting</h1>" + System.lineSeparator());
		assertTrue(html_builder.getResult().equals(sb.toString()));
	}

	public void testMakeString() {
		html_builder.makeHeadingLevel2("朝から昼にかけて");
		assertTrue(html_builder.getResult().equals("<h2>朝から昼にかけて</h2>" + System.lineSeparator()));
	}

	public void testMakeItems() {
		html_builder.makeItems(new String[] {"Good Morning", "こんにちは"});
		StringBuilder sb = new StringBuilder("<ul>" + System.lineSeparator());
		sb.append("<li>Good Morning</li>" + System.lineSeparator());
		sb.append("<li>こんにちは</li>" + System.lineSeparator());
		sb.append("</ul>" + System.lineSeparator());
		assertTrue(html_builder.getResult().equals(sb.toString()));
	}
}
