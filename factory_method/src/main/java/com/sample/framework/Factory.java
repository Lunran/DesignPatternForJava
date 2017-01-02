package com.sample.framework;

public abstract class Factory {

	public final Product create(String name) {
		Product p = createProduct(name);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String name);
	protected abstract void registerProduct(Product product);
}
