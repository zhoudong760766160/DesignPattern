package com.zhoudong.prototype;

public class UnderlinePen extends AbstractProduct implements Product {

	private char lineChar;
	
	public UnderlinePen(char lineChar) {
		this.lineChar = lineChar;
	}
	
	@Override
	public void use(String str) {
		int length = str.getBytes().length;
		System.out.println("\""+str+"\"");
		System.out.print("  ");
		for (int i = 0; i < length; i++) {
			System.out.print(lineChar);
		}
		System.out.println("");
	}

}
