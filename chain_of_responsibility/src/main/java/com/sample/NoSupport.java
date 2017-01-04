package com.sample;

public class NoSupport extends Support {

	public NoSupport(String string) {
		super(string);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
