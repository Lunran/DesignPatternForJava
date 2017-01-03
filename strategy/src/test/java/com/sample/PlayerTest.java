package com.sample;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {

	Player player;

	public void setUp() {
		player = new Player("Hoge", new WinningStrategy(100));
	}

	public void testToString() {
		assertTrue(player.toString().equals("Hoge: 0 games, 0 win, 0 lose"));
	}
}
