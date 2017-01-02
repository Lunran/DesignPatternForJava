package com.sample.framework;

public abstract class Product implements Cloneable {

	public abstract void use(String string);

	public Product createClone() {
		Product clone = null;
		try {
			clone = (Product) clone();
		}
		catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		return clone;
	}
}
