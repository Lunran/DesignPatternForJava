package com.sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class HtmlWriter {

	private Writer writer;

	HtmlWriter(String filename) {
		try {
			this.writer = new FileWriter(filename);
		}
		catch (IOException ie) {
			System.out.println("Warning: cannot overwrite the file.");
		}
	}

	void title(String title) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>\n<head><title>").append(title).append("</title></head>\n");
		sb.append("<body>\n<h1>").append(title).append("</h1>\n");
		write(sb.toString());
	}

	void paragraph(String string) {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>").append(string).append("</p>\n");
		write(sb.toString());
	}

	void mailto(String mailaddr, String username) {
		link("mailto: " + mailaddr, username);
	}

	void link(String href, String caption) {
		StringBuilder sb = new StringBuilder();
		sb.append("<a href=\"").append(href).append("\">").append(caption).append("</a>");
		write(sb.toString());
	}

	void close() {
		StringBuilder sb = new StringBuilder();
		sb.append("</body>\n</html>\n");
		write(sb.toString());
		try {
			writer.close();
		}
		catch (IOException ie) {
			System.out.println("Warning: cannot close the file writer.");
		}
	}

	private void write(String string) {
		System.out.print(string);
		try {
			writer.write(string);
		}
		catch (IOException ie) {
			System.out.println("Warning: cannot overwrite the file.");
		}
	}

}
