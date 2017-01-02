package com.sample;

import com.sample.framework.Manager;
import com.sample.framework.Product;

class Main {
	public static void main(String args[]) {

		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		Product strong_message = manager.create("strong message");
		strong_message.use("Hello, world.");
		Product warning_box = manager.create("warning box");
		warning_box.use("Hello, world.");
		Product slash_box = manager.create("slash box");
		slash_box.use("Hello, world.");
	}
}
