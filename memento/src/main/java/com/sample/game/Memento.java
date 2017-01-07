package com.sample.game;

public class Memento {

	private int money, age;

	Memento(int money) {
		this.money = money;
		age = 0;
	}

	public int getMoney() {
		return money;
	}

	int getAge() {
		return age;
	}

}
