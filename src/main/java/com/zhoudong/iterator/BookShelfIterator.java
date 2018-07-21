package com.zhoudong.iterator;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Object next() {
		return bookShelf.getBookAt(index ++);
	}

}
