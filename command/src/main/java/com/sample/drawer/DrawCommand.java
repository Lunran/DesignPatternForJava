package com.sample.drawer;

import java.awt.Color;
import java.awt.Point;

import com.sample.command.Command;

public class DrawCommand implements Command {

	protected Drawable drawable;
	private Point point;
	private Color color;

	public DrawCommand(Drawable drawable, Point point, Color color) {
		this.drawable = drawable;
		this.point = point;
		this.color = color;
	}

	@Override
	public void execute() {
		drawable.draw(point, color);
	}

}
