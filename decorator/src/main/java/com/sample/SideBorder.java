package com.sample;

public class SideBorder extends Border {

	private char borderChar;

	public SideBorder(Display display, char boarderChar) {
		super(display);
		this.borderChar = boarderChar;
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}
