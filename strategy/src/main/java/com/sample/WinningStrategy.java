package com.sample;

public class WinningStrategy extends Strategy {

	public WinningStrategy(int seed) {
		super(seed);
	}

	@Override
	public void study(boolean b) {
		if (!b) {
			setNextHandRandomly();
		}
		else {
			// do nothing
		}
	}

}
