package com.sample;

public enum Hand {
	ROCK, PAPER, SCISSORS;

	public boolean isStrongerThan(Hand otherHand) {
		switch(this) {
		case ROCK:
			return otherHand.equals(SCISSORS);
		case PAPER:
			return otherHand.equals(ROCK);
		case SCISSORS:
			return otherHand.equals(PAPER);
		default:
			// TODO: throw an exception or leave a log message
			return false;
		}
	}

	@Override
	public String toString() {
		switch(this) {
		case ROCK:
			return "Rock";
		case PAPER:
			return "Paper";
		case SCISSORS:
			return "Scissors";
		default:
			return "unknown";
		}
	}
}
