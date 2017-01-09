package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

	private String fontdata;

	public BigChar(char charname) {
		try {
			String filepath = BigChar.class.getClassLoader().getResource("big" + charname + ".txt").getPath();
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line;
			StringBuffer buf = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();
		}
		catch (NullPointerException npe) {
			System.out.println("NullPointerException!");
			this.fontdata = charname + "?";
		}
		catch (IOException ie) {
			System.out.println("IOException!");
			this.fontdata = charname + "?";
		}
	}

	public void print() {
		System.out.print(fontdata);
	}

}
