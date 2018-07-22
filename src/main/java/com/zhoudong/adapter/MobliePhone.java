package com.zhoudong.adapter;

public class MobliePhone {

	public void charging(AC2DC charg) {
		int vol = charg.output();
		if(vol == 5) {
			System.out.println("charging...");
		}else {
			System.out.println("boom!!!");
		}
	}
}
