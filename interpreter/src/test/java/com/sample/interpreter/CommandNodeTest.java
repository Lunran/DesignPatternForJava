package com.sample.interpreter;

import junit.framework.TestCase;

public class CommandNodeTest extends TestCase {

	Node node;
	protected void setUp() throws Exception {
		super.setUp();
		node = new CommandNode();
	}

	public void testParseSucceed1() {
		try {
			node.parse(new Context("repeat 3 go end"));
		} catch (ParseException pe) {
			fail();
		}
	}

	public void testParseSucceed2() {
		try {
			node.parse(new Context("go"));
		} catch (ParseException pe) {
			fail();
		}
	}

	public void testParseFail() {
		try {
			node.parse(new Context("program go end"));
			fail();
		} catch (ParseException expected) {
			assertTrue(true);
		}
	}

}
