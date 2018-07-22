package com.zhoudong.templatemethod;

public abstract class AbstractDisplayer {

	public abstract void open();
	
	public abstract void print();
	
	public abstract void close();
	
	/**
	 * avoid override
	 */
	public final void display() {
		open();
		for(int i = 0; i<5;i ++) {
			print();
		}
		close();
	}
}
