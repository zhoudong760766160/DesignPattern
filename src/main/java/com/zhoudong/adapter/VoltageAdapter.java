package com.zhoudong.adapter;

public class VoltageAdapter extends AC220 implements AC2DC{

	@Override
	public int output() {
		int vol = super.output();
		System.out.println("AC to DC");
		return vol/44;
	}
}
