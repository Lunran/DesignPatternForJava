package com.sample.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	Map<String, Product> map = new HashMap<String, Product>();

	public Product create(String string) {
		Product product = map.get(string);
		if (product == null) {
			return null;
		}

		return product.createClone();
	}

	public void register(String string, Product product) {
		map.put(string, product);
	}

	// TODO: add exceptional cases
}
