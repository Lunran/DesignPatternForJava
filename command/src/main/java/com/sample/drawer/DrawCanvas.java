package com.sample.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import com.sample.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {

	private static final long serialVersionUID = 5503655549237703724L;

	private int radius = 6;
	private MacroCommand history;

	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}

	public void paint(Graphics g) {
		history.execute();
	}

	@Override
	public void draw(Point point, Color color) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(point.x-radius, point.y-radius, radius*2, radius*2);
	}

}
