package com.zhoudong.adapter.templatemethod;

public class CharDisplayer extends AbstractDisplayer {

	private char cha;
	public CharDisplayer(char cha) {
		this.cha = cha;
	}
	
	@Override
	public void open() {
		System.out.print("<<<");
	}

	@Override
	public void print() {
		System.out.print(cha);
	}

	@Override
	public void close() {
		System.out.println(">>>");
	}

}
