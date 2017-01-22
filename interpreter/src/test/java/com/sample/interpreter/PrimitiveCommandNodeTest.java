package com.sample.interpreter;

import junit.framework.TestCase;

public class PrimitiveCommandNodeTest extends TestCase {

	Node node;
	protected void setUp() throws Exception {
		super.setUp();
		node = new PrimitiveCommandNode();
	}

	public void testParseSucceed() {
		try {
			node.parse(new Context("go right left"));
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
