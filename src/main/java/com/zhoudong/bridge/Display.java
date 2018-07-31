package com.zhoudong.bridge;

public class Display {

	private AbstractDisplay display;
	
	public Display(AbstractDisplay display) {
		this.display = display;
	}
	
	public void open() {
		display.rawOpen();
	}

	public void print() {
		display.rawPrint();
	}

	public void close() {
		display.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}

}
