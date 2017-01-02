package com.sample.listfactory;

import java.util.Iterator;

import com.sample.factory.Item;
import com.sample.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("<li>\n").append(caption).append("\n").append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n").append("</li>\n");
		return buffer.toString();
	}

}
