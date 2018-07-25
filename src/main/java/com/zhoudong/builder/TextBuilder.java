package com.zhoudong.builder;

public class TextBuilder implements Builder {

	private StringBuffer sbuf = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		sbuf.append("==========\n");
		sbuf.append("["+title+"]\n");
		sbuf.append("\n");
	}

	@Override
	public void makeString(String str) {
		sbuf.append("/"+str+"\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			sbuf.append(" ."+items[i]+"\n");
		}
		sbuf.append("\n");
	}

	@Override
	public void close() {
		sbuf.append("==========\n");
	}
	
	public String getResult() {
		return sbuf.toString();
	}

}
