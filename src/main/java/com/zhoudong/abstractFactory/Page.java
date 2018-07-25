package com.zhoudong.abstractFactory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {

	protected String title;
	protected String author;
	protected List<Item> items = new ArrayList<Item>();
	
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void output() throws Exception {
		String fileName = title + ".html";
		Writer writer = new  FileWriter(fileName);
		writer.close();
		System.out.println(fileName+"编写完成。");
	}
	
	public abstract String makeHTML();
}
