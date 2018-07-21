package com.zhoudong.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		bookShelf.append(new Book("Harry Potter"));
		bookShelf.append(new Book("The Godfather"));
		bookShelf.append(new Book("American Beauty"));
		
		Iterator iterator = bookShelf.iterator();
		while(iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}
}
