package com.sample;

public class MarkdownBuilder extends Builder {

	@Override
	public void open(String title) {
	}

	@Override
	public void makeHeadingLevel1(String title) {
		result.append("# ").append(title).append(System.lineSeparator());
	}

	@Override
	public void makeHeadingLevel2(String str) {
		result.append("## ").append(str).append(System.lineSeparator());
	}

	@Override
	public void makeItems(String[] items) {
		for (String item: items) {
			result.append("- ").append(item).append(System.lineSeparator());
		}
	}

	@Override
	public void close() {
	}

}
