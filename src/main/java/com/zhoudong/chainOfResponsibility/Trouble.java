package com.zhoudong.chainOfResponsibility;

public class Trouble {

	private int num;
	
	public Trouble(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Trouble [num=" + num + "]";
	}
	
}
