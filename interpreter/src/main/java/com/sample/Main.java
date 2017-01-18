package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;

class Main {
	public static void main(String args[]) {
		try {
			String filepath = Main.class.getClassLoader().getResource("program.txt").getPath();
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String text;
			while ((text = reader.readLine()) != null) {
				System.out.println("text = \"" + text + "\"");
				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println("node = " + node);
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
