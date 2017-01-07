package com.sample;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

	protected int number;

	public int getNumber() {
		return number;
	}

	/**
	 * Start generating numbers repeatedly
	 *
	 */
	public void execute() {
		for (int i=0; i<10; i++) {
			generateNumber();
			notifyObservers();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Interrupted during sleep");
			}
		}
	}

	public abstract void generateNumber();

	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(this);
		}
	}

}
