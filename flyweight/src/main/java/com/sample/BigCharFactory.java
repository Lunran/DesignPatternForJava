package com.sample;

import java.util.HashMap;

public class BigCharFactory {

	private static final BigCharFactory singleton = new BigCharFactory();
	private HashMap<Character, BigChar>  pool = new HashMap<>();

	private BigCharFactory() {
	}

	public static BigCharFactory getInstance() {
		return singleton;
	}

	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = pool.get(charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put(charname, bc);
		}
		return bc;
	}

}
