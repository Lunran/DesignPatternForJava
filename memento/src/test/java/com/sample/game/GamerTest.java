package com.sample.game;

import junit.framework.TestCase;

public class GamerTest extends TestCase {

	Gamer gamer;

	public void setUp() {
		gamer = new Gamer(100);
	}

	public void testBet1() {
		gamer.bet(1);
		assertTrue(gamer.getMoney() == 200100);
		assertTrue(gamer.getAge() == 1);
	}

	public void testBet2() {
		gamer.bet(2);
		assertTrue(gamer.getMoney() == 200100);
		assertTrue(gamer.getAge() == 1);
	}

	public void testBet3() {
		gamer.bet(3);
		assertTrue(gamer.getMoney() == 200100);
		assertTrue(gamer.getAge() == 1);
	}

	public void testBet4() {
		gamer.bet(4);
		assertTrue(gamer.getMoney() == 50);
		assertTrue(gamer.getAge() == 1);
	}

	public void testBet5() {
		gamer.bet(5);
		assertTrue(gamer.getMoney() == 50);
		assertTrue(gamer.getAge() == 1);
	}

	public void testBet6() {
		gamer.bet(6);
		assertTrue(gamer.getMoney() == 100);
		assertTrue(gamer.getAge() == 1);
	}

	public void testCreateMemento() {
		Memento memento = gamer.createMemento();
		assertTrue(memento.getMoney() == 100);
		assertTrue(memento.getAge() == 0);
	}

	public void testRestoreMemento() {
		Gamer gamer2 = new Gamer(200);
		Memento memento = gamer2.createMemento();
		gamer.restoreMemento(memento);
		assertTrue(gamer.getMoney() == 200);
		assertTrue(memento.getAge() == 0);
	}

}
