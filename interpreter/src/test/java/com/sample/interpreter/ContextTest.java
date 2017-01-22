package com.sample.interpreter;

import junit.framework.TestCase;

public class ContextTest extends TestCase {

	Context context;

	protected void setUp() throws Exception {
		super.setUp();
		context = new Context("program go end");
	}

	public void testCurrentToken() {
		String string = context.currentToken();
		assertTrue(string.equals("program"));
	}

	public void testNextToken() {
		String string = context.nextToken();
		assertTrue(string.equals("go"));
	}

	public void testSkipTokenSucceed() {
		try {
			context.skipToken("program");
		}
		catch (ParseException pe) {
			fail();
		}
		String string = context.currentToken();
		assertTrue(string.equals("go"));
	}

	public void testSkipTokenFail() {
		try {
			context.skipToken("go");
			fail();
		}
		catch (ParseException extected) {
			assertTrue(true);
		}
	}

	public void testCurrentNumberSucceed() {
		Context numberContext = new Context("1");
		int parsedInt = 0;
		try {
			parsedInt = numberContext.currentNumber();
		}
		catch (ParseException pe) {
			fail();
		}
		assertTrue(parsedInt == 1);
	}

	public void testCurrentNumberFail() {
		try {
			context.currentNumber();
			fail();
		}
		catch (ParseException extected) {
			assertTrue(true);
		}
	}

}
