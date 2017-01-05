package com.sample.pagemaker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Properties;

import junit.framework.TestCase;

public class DatabaseTest extends TestCase {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	public void setUp() {
		System.setOut(new PrintStream(out));
	}

	public void testGetPropertiesSucceed() {
		Properties properties = Database.getProperties("/home/k1096/DesignPatternForJava/facade/src/test/java/com/sample/pagemaker/ほげ.txt");
		assertTrue(properties != null);
		assertTrue(properties.getProperty("ほげ@ほげ.com") == null);
		assertTrue(properties.getProperty("hoge@hoge.com").equals("hoge hoge"));
	}

	public void testGetPropertiesFail() {
		Properties properties = Database.getProperties("/home/k1096/DesignPatternForJava/facade/src/test/java/com/sample/pagemaker/hoge.txt");
		assertTrue(properties != null);
		assertTrue(out.toString().equals("Warning: /home/k1096/DesignPatternForJava/facade/src/test/java/com/sample/pagemaker/hoge.txt is not found.\n"));
	}

}
