package com.sample.listfactory;

import com.sample.factory.Factory;
import com.sample.factory.Link;
import com.sample.factory.Page;
import com.sample.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
	
}
