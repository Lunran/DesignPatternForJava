package com.sample;

import com.sample.framework.Factory;
import com.sample.framework.Product;
import com.sample.idcard.IDCardFactory;

class Main {
	public static void main(String args[]) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("ほげ田ほげ夫");
		Product card2 = factory.create("ぴよ子");
		Product card3 = factory.create("ふが太郎");
		card1.use();
		card2.use();
		card3.use();
	}
}
