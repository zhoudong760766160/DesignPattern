package com.zhoudong.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> directory = new ArrayList<Entry>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			size += it.next().getSize();
		}
		return size;
	}
	
	@Override
	public Entry add(Entry entry) throws FileTreatmentException {
		directory.add(entry);
		return this;
	}

	@Override
	public void printList(String prefix) {
		System.out.println(prefix+"/"+this);
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			entry.printList(prefix+"/"+name);
		}
	}

}
