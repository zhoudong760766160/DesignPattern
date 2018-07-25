package com.zhoudong.builder;

public class HTMLBuilder implements Builder{

	private StringBuffer sbuf = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		sbuf.append("<html><head><title>"+title+"</title></head><body>\n");
		sbuf.append("<h1>"+title+"</h1>\n");
	}

	@Override
	public void makeString(String str) {
		sbuf.append("<p>"+str+"</p>\n");
	}

	@Override
	public void makeItems(String[] items) {
		sbuf.append("<ul>\n");
		for (int i = 0; i < items.length; i++) {
			sbuf.append("<li>"+items[i]+"</li>\n");
		}
		sbuf.append("</ul>");
	}

	@Override
	public void close() {
		sbuf.append("\n</body></html>");
	}
	
	public String getResult() {
		return sbuf.toString();
	}

}
