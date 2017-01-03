package com.sample;

import junit.framework.TestCase;

public class WinningStrategyTest extends TestCase {

	WinningStrategy winningStrategy;

	public void setUp() {
		winningStrategy = new WinningStrategy(300);
	}

	public void testInit() {
		assertTrue(winningStrategy.nextHand().equals(Hand.ROCK));
	}
}
