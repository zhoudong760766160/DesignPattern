package com.zhoudong.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{

	protected List<Item> Items = new ArrayList<Item>();
	
	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		Items.add(item);
	}
}
