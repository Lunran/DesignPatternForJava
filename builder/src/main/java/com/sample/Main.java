package com.sample;

class Main {
	public static void main(String args[]) {
		String format;
		if (args.length >= 1) {
			format = args[0];
		}
		else {
			format = "html";
		}

		Director director;
		switch (format) {
		case "plain":
			MarkdownBuilder textbuilder = new MarkdownBuilder();
			director = new Director(textbuilder);
			director.construct();
			System.out.println(textbuilder.getResult());
			break;
		case "html":
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			director = new Director(htmlbuilder);
			director.construct();
			System.out.println(htmlbuilder.getResult());
			break;
		default:
			// do nothing
			break;
		}
	}
}
