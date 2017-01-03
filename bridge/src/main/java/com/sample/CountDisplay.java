package com.sample;

public class CountDisplay extends Display {

	DisplayImpl displayImpl;

	public CountDisplay(DisplayImpl displayImpl) {
		super(displayImpl);
		this.displayImpl = displayImpl;
	}

	public void multidisplay(int count) {
		open();
		for (int i=0; i<count; i++) {
			print();
		}
		close();
	}

}
