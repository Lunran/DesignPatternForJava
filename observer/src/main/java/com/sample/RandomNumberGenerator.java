package com.sample;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

	private Random random = new Random();

	@Override
	public void generateNumber() {
		number = random.nextInt(50);
	}

}
