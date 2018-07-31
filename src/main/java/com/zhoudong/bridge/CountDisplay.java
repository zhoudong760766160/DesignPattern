package com.zhoudong.bridge;

public class CountDisplay extends Display {

	public CountDisplay(AbstractDisplay display) {
		super(display);
	}

	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
