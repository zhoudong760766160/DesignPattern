package com.zhoudong.builder;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void constract(){
		builder.makeTitle("Greeting");
		builder.makeString("From Morning to afternoon");
		builder.makeItems(new String[]{"Good Morning","Good afternoon"});
		builder.makeString("Evening");
		builder.makeItems(new String[] {"Good evening","Good night","Goodbye"});
		builder.close();
	}
}
