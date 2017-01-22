package com.sample.interpreter;

import junit.framework.TestCase;

public class RepeatCommandNodeTest extends TestCase {

	Node node;
	protected void setUp() throws Exception {
		super.setUp();
		node = new RepeatCommandNode();
	}

	public void testParseSucceed() {
		try {
			node.parse(new Context("repeat 3 go end"));
		} catch (ParseException pe) {
			fail();
		}
	}

	public void testParseFail() {
		try {
			node.parse(new Context("go"));
			fail();
		} catch (ParseException expected) {
			assertTrue(true);
		}
	}

}
