package com.zhoudong.prototype;

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		UnderlinePen pen = new UnderlinePen('~');
		ManagerBox box1 = new ManagerBox('*');
		ManagerBox box2 = new ManagerBox('/');
		
		manager.register("strong msg", pen);
		manager.register("warning box", box1);
		manager.register("slash box", box2);
		
		Product p1 = manager.create("strong msg");  
		p1.use("Hello World.");
		Product p2 = manager.create("warning box");
		p2.use("Hello World.");
		Product p3 = manager.create("slash box");
		p3.use("Hello World.");
		
	}
}
