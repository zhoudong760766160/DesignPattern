package com.zhoudong.decorator;

public class StringDisplay extends Display {
	
	private String str;
	
	public StringDisplay(String str) {
		this.str = str;
	}

	@Override
	public int getColumns() {
		return str.getBytes().length;
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(int row) {
		return row == 0?str:null;
	}

}
