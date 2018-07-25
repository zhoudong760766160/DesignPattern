package com.zhoudong.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Object> showCase = new HashMap<String, Object>();
	
	public void register(String protoName, Product proto) {
		showCase.put(protoName, proto);
	}
	
	public Product create(String protoName) {
		Product proto = (Product) showCase.get(protoName);
		return proto.createClone();
	}
}
