package com.sample;

public class Player {

	private String name;
	private Strategy strategy;
	private int win=0, lose=0, even=0;

	public Player(String string, Strategy strategy) {
		this.name = string;
		this.strategy = strategy;
	}

	@Override
	public String toString() {
		return name + ": " + (win+lose+even) +" games, " + win + " win, " + lose + " lose";
	}

	public Hand nextHand() {
		return strategy.nextHand();
	}

	public void win() {
		strategy.study(true);
		win++;
	}

	public void lose() {
		strategy.study(false);
		lose++;
	}

	public void even() {
		strategy.study(false);
		even++;
	}

}
