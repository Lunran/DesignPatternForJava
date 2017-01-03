package com.sample;

import junit.framework.TestCase;

public class HandTest extends TestCase {

	Hand hand;

	public void setUp() {
		hand = Hand.ROCK;
	}

	public void testRock1() {
		assertTrue(hand.isStrongerThan(Hand.SCISSORS));
	}
	public void testRock2() {
		assertFalse(hand.isStrongerThan(Hand.ROCK));
	}
	public void testRock3() {
		assertFalse(hand.isStrongerThan(Hand.PAPER));
	}
}
