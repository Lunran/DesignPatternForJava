package com.sample.listfactory;

import java.util.Iterator;

import com.sample.factory.Item;
import com.sample.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("<html>\n<head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n<h1>" + title + "</h1>\n<ul>\n");
		Iterator<Item> it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n<hr><address>" + author + "</address>\n</body>\n</html>\n");
		return buffer.toString();
	}

}
