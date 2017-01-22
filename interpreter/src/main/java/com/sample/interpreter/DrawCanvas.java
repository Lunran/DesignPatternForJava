package com.sample.interpreter;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrawCanvas extends Canvas {

	private static final long serialVersionUID = 5503655549237703724L;

	public static final int CANVAS_SIZE = 400;
	private static final int POINT_RADIUS = 6;
	private static final int TRANSLATION_DISTANCE = 20;

	private List<Point> points = new ArrayList<>();
	private Point currentPoint = new Point(CANVAS_SIZE/2, CANVAS_SIZE/2);
	private Direction currentDirection = Direction.NORTH;
	private Map<Direction, Point> translationMap = new HashMap<>();

	public DrawCanvas() {
		setSize(CANVAS_SIZE, CANVAS_SIZE);
		setBackground(Color.white);
		points.add(currentPoint.getLocation());
		translationMap.put(Direction.NORTH, new Point(0, -TRANSLATION_DISTANCE));
		translationMap.put(Direction.SOUTH, new Point(0, TRANSLATION_DISTANCE));
		translationMap.put(Direction.EAST, new Point(TRANSLATION_DISTANCE, 0));
		translationMap.put(Direction.WEST, new Point(-TRANSLATION_DISTANCE, 0));
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		for (int i=0; i<points.size(); i++) {
			g.fillOval(points.get(i).x-POINT_RADIUS, points.get(i).y-POINT_RADIUS, POINT_RADIUS*2, POINT_RADIUS*2);
			if (i >= 1) {
				g.drawLine(points.get(i-1).x, points.get(i-1).y, points.get(i).x, points.get(i).y);
			}
		}
	}

	public void go() {
		Point p = translationMap.get(currentDirection);
		currentPoint.translate(p.x, p.y);
		points.add(currentPoint.getLocation());
	}

	public void right() {
		currentDirection = currentDirection.getRight();
	}

	public void left() {
		currentDirection = currentDirection.getLeft();
	}

	public enum Direction {
		EAST, WEST, NORTH, SOUTH;

		public Direction getRight() {
			switch(this) {
			case EAST:
				return SOUTH;
			case WEST:
				return NORTH;
			case NORTH:
				return EAST;
			case SOUTH:
				return WEST;
			default:
				// TODO: throw an exception or leave a log message
				return NORTH;
			}
		}

		public Direction getLeft() {
			switch(this) {
			case EAST:
				return NORTH;
			case WEST:
				return SOUTH;
			case NORTH:
				return WEST;
			case SOUTH:
				return EAST;
			default:
				// TODO: throw an exception or leave a log message
				return NORTH;
			}
		}
	}

}
