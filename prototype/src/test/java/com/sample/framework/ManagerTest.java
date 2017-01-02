package com.sample.framework;

import com.sample.UnderlinePen;

import junit.framework.TestCase;

public class ManagerTest extends TestCase {

	Manager manager;

	public void setUp() {
		manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		manager.register("strong message", upen);
	}

	public void testValidCreate() {
		Product p = manager.create("strong message");
		assertTrue(p != null);
	}

	public void testInvalidCreate() {
		Product p = manager.create("slash box");
		assertTrue(p == null);
	}

	// ENHANCE: add multi-thread test cases
}
