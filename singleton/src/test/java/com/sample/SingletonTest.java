package com.sample;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

	Singleton singleton;

	public void testGetInstance() {
		Singleton singleton = Singleton.getInstance();
		assertTrue(singleton != null);
		assertTrue(singleton == Singleton.getInstance());
	}

	// ENHANCE: add multi-thread test cases
}
