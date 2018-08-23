package com.zhoudong.decorator;

public class SideDisplay extends Border{
	
	private char borderChar;
	
	public SideDisplay(Display display,char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}
