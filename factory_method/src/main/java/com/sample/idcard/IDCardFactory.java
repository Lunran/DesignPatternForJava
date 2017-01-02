package com.sample.idcard;

import com.sample.framework.Factory;
import com.sample.framework.Product;

public class IDCardFactory extends Factory {

	@Override
	protected Product createProduct(String name) {
		System.out.println(name + "のカードを作ります。");
		return new IDCard(name);
	}

	@Override
	protected void registerProduct(Product product) {
	}
}
