package com.sample;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {

	private static final long serialVersionUID = 3702876021907984069L;

	public ColleagueButton(String string) {
		super(string);
	}

	@Override
	public void setMediator(Mediator mediator) {
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

}
