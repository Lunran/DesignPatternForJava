package com.sample.pagemaker;

import java.util.Properties;

public class PageMaker {

	private PageMaker() {}

	public static void makeWelcomePage(String mailaddr, String filename) {
		Properties mailprop = Database.getProperties("/home/k1096/DesignPatternForJava/facade/src/main/java/com/sample/maildata.txt");
		String username = mailprop.getProperty(mailaddr);
		HtmlWriter writer = new HtmlWriter(filename);
		writer.title("Welcome to " + username + "'s page!");
		writer.paragraph(username + "のページへようこそ。");
		writer.paragraph("メールまっていますね。");
		writer.mailto(mailaddr, username);
		writer.close();
		System.out.println(filename + " is created for " + mailaddr + " (" + username + ") ");
	}
	
}
