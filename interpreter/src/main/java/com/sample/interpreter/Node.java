package com.sample.interpreter;

public abstract class Node {

	public abstract void parse(Context context) throws ParseException;
	public abstract void draw(DrawCanvas canvas);
}
