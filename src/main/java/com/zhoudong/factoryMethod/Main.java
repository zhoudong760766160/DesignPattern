package com.zhoudong.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product Tom = factory.create("Tom");
		Product Jerry = factory.create("Jerry");
		
		Tom.use();
//		Jerry.use();
	}
}
