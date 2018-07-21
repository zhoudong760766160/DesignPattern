package com.zhoudong.iterator;

public class BookShelf implements Aggregate{

	private Book[] books;
	private int last;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
		last = 0;
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void append(Book book) {
		this.books[last ++] = book;
	}
	
	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
