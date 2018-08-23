package com.zhoudong.chainOfResponsibility;

public class SpecialSupport extends Support {
	
	private int num;
	
	public SpecialSupport(String name,int num) {
		super(name);
		this.num = num;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return num == trouble.getNum();
	}

}
