package com.sample;

public interface Context {

	void setClock(int hour);
	void changeState(State state);
	void callSecurityCenter(String string);
	void recordLog(String string);

}
