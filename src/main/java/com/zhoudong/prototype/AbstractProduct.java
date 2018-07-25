package com.zhoudong.prototype;

public class AbstractProduct implements Product {

	@Override
	public void use(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public final Product createClone() {
		Product proto = null;
		try {
			proto = (Product)clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return proto;
	}

}
