package com.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

	private String filename;
	private PrintWriter writer;
	
	@Override
	public void open(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		}
		catch (IOException ie) {
			ie.printStackTrace();
		}
		result.append("<html><head><title>").append(title).
			append("</title></head><body>").append(System.lineSeparator());
	}

	@Override
	public void makeHeadingLevel1(String title) {
		result.append("<h1>").append(title).append("</h1>").append(System.lineSeparator());
	}

	@Override
	public void makeHeadingLevel2(String str) {
		result.append("<h2>").append(str).append("</h2>").append(System.lineSeparator());
	}

	@Override
	public void makeItems(String[] items) {
		result.append("<ul>").append(System.lineSeparator());
		for (String item: items) {
			result.append("<li>").append(item).append("</li>").append(System.lineSeparator());
		}
		result.append("</ul>" + System.lineSeparator());
	}

	@Override
	public void close() {
		result.append("</body></html>").append(System.lineSeparator());
		writer.print(result);
		writer.close();
	}
}
