package com.sample.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * BNF: <command list> ::= <command>* end
 *
 */
public class CommandListNode extends Node {

	private List<Node> list = new ArrayList<>();

	@Override
	public void parse(Context context) throws ParseException {
		while (true) {
			if (context.currentToken() == null) {
				throw new ParseException("Missing 'end'");
			}
			else if (context.currentToken().equals("end")) {
				context.skipToken("end");
				break;
			}
			else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}

	@Override
	public String toString() {
		return list.toString();
	}

	@Override
	public void draw(DrawCanvas canvas) {
		for (Node n: list) {
			n.draw(canvas);
		}
	}
}