package com.zhoudong.adapter.templatemethod;

/**
 * 父类定义流程具体实现模板，具体实现交由子类
 * @author zhoudong
 */
public class Main {

	public static void main(String[] args) {
		CharDisplayer charDisplayer = new CharDisplayer('H');
		StringDisplayer stringDisplayer = new StringDisplayer("Hello,World.");
		
		charDisplayer.display();
		stringDisplayer.display();
	}
}
