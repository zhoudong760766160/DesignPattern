package com.zhoudong.adapter.templatemethod;

public class StringDisplayer extends AbstractDisplayer {

	private String str;
	
	public StringDisplayer(String str) {
		this.str = str;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|"+str+"|");
	}

	@Override
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i = 0;i<str.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
