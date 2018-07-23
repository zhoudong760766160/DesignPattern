package com.zhoudong.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("生产了一个singleton实例");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
