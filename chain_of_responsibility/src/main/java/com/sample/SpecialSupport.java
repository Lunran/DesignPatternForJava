package com.sample;

public class SpecialSupport extends Support {

	int limit;

	public SpecialSupport(String string, int limit) {
		super(string);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == limit) {
			return true;
		}
		else {
			return false;
		}
	}

}
