package com.sample.game;

import java.util.Random;

public class Gamer {

	private int money, age;
	Random random = new Random();

	public Gamer(int initialMoney) {
		money = initialMoney;
		age = 0;
	}

	public int getMoney() {
		return money;
	}

	/**
	 * for test
	 *
	 */
	int getAge() {
		return age;
	}

	public int throwDice() {
		return random.nextInt(6) + 1;
	}

	public void bet(int dice) {
		switch (dice) {
		case 1:
		case 2:
		case 3:
			money += 200000;
			System.out.println("所持金が増えました。");
			break;
		case 4:
		case 5:
			money /= 2;
			System.out.println("所持金が減りました。");
			break;
		default:
			System.out.println("何も起きませんでした。");
			break;
		}
		age++;
	}

	public Memento createMemento() {
		return new Memento(money);
	}

	public void restoreMemento(Memento memento) {
		money = memento.getMoney();
	}

	@Override
	public String toString() {
		return "[money = " + money + "], [age = " + age + "]";
	}

}
