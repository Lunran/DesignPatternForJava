package com.sample;

public class LimitSupport extends Support {

	int limit;

	public LimitSupport(String string, int limit) {
		super(string);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		}
		else {
			return false;
		}
	}

}
