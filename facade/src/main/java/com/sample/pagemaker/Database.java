package com.sample.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {

	static Properties getProperties(String filename) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		}
		catch (IOException ie) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}

}
