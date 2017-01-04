package com.sample;

public class FullBorder extends Border {

	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows() + 2;
	}

	@Override
	public String getRowText(int row) {
		StringBuilder sb = new StringBuilder();
		if (row == 0 || row == display.getRows()+1) {
			sb.append('+');
			for (int i=0; i<display.getColumns(); i++) {
				sb.append('-');
			}
			sb.append('+');
		}
		else {
			sb.append("|").append(display.getRowText(row-1)).append("|");
		}
		return sb.toString();
	}
}
