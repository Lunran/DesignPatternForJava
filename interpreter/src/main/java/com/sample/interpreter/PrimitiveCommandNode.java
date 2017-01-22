package com.sample.interpreter;

/**
 * BNF: <primitive command> ::= go | right | left
 *
 */
public class PrimitiveCommandNode extends Node {

	private String name;

	@Override
	public void parse(Context context) throws ParseException {
		name = context.currentToken();
		context.skipToken(name);
		if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
			throw new ParseException(name + " is undefined");
		}
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void draw(DrawCanvas canvas) {
		switch(name) {
		case "go":
			canvas.go();
			break;
		case "right":
			canvas.right();
			break;
		case "left":
			canvas.left();
			break;
		}
	}
}
