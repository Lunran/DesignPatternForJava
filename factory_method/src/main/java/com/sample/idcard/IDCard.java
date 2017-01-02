package com.sample.idcard;

import com.sample.framework.Product;

public class IDCard extends Product {

	String name;

	IDCard(String name) {
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println(name + "のカードを使います。");
	}
}
