package com.zhoudong.builder;

public class Main {

	public static void main(String[] args) {
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.constract();
		String textResult = textBuilder.getResult();
		System.out.println(textResult);
		
		HTMLBuilder htmlBuilder = new HTMLBuilder();
		director = new Director(htmlBuilder);
		director.constract();
		String htmlResult = htmlBuilder.getResult();
		System.out.println(htmlResult);
	}
}
