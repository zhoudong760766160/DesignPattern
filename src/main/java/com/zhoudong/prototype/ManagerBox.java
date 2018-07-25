package com.zhoudong.prototype;

public class ManagerBox extends AbstractProduct  implements Product {

	private char decodeChar;
	
	public ManagerBox(char decodeChar) {
		this.decodeChar = decodeChar;
	}
	
	@Override
	public void use(String str) {
		int length = str.getBytes().length;
		for (int i = 0; i < length; i++) {
			System.out.print(decodeChar);
		}
		System.out.println("");
		System.out.println(decodeChar + " " + str + " "+ decodeChar);
		for (int i = 0; i < length+4; i++) {
			System.out.print(decodeChar);
		}
		System.out.println("");
	}

}
