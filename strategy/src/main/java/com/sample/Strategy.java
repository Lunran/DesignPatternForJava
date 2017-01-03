package com.sample;

import java.util.Random;

public abstract class Strategy {

	private Random rand;
	protected Hand nextHand = Hand.ROCK;

	public Strategy(int seed) {
		this.rand = new Random(seed);
	}

	public abstract void study(boolean b);

	public Hand nextHand() {
		return nextHand;
	}

	protected void setNextHandRandomly() {
		switch(rand.nextInt(3)) {
		case 0:
			nextHand = Hand.ROCK;
			break;
		case 1:
			nextHand = Hand.PAPER;
			break;
		case 2:
			nextHand = Hand.SCISSORS;
			break;
		default:
			break;
		}
	}
}
