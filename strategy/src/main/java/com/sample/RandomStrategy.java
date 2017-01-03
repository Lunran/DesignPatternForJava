package com.sample;

public class RandomStrategy extends Strategy {

	public RandomStrategy(int seed) {
		super(seed);
	}

	@Override
	public void study(boolean b) {
		setNextHandRandomly();
	}

}
