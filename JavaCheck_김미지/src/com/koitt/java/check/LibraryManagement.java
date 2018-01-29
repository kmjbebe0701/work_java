package com.koitt.java.check;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement implements ILibrary {
	private List<Book> list;
	private List<Magazine> mlist;
	Book[] book;
	int count = 0;

	public LibraryManagement() {
		super();
		this.list = new ArrayList<Book>();
		this.mlist = new ArrayList<>();
		
	}

	@Override
	public boolean addBook(Book book) {
		if (book.getIsbn().equals("B")) {
			for (Book item : this.list) {
				if (item.equals(book)) {
					return false;
				}
			}
			book.setIsbn("B"+ (++count));
			list.add(book);
			return true;
		}
		else if (book.getIsbn().equals("M")) {
			for (Magazine item : this.mlist) {
				if (item.equals(book)) {
					return false;
				}
			}
			book.setIsbn("M"+ (++count));
			mlist.add((Magazine)book);
			return true;
		}
		return false;
	}

	@Override
	public boolean delBook(String isbn) {
		for (Book item : this.list) {
			if (item.equals(isbn)) {
				list.remove(item);
			}
		}
		for (Magazine item : this.mlist) {
			if (item.equals(isbn)) {
				mlist.remove(item);
			}
		}
		return false;
	}

	@Override
	public Book[] allBooks() {
		int i = 0;
		for (Book item : this.list) {
			book[i] = item;
		}
		for (Book item : this.mlist) {
			book[list.size() + i] = item;
		}
		return book;
	}

	@Override
	public void showAll() {
		this.allBooks();

	}

	@Override
	public void showAllBooks() {
		for (Book item : this.list) {
			System.out.println(item);
		}

	}

	@Override
	public void showAllMagazines() {
		for (Magazine item : this.mlist) {
			System.out.println(item);
		}

	}

	@Override
	public int size(String type) {
		if (type.equals("M")) {
			return mlist.size();
		}
		
		return list.size();
	}

	@Override
	public Book getBook(String title) {
		for (Book item : this.list) {
			if (item.equals(title)) {
				return item;
			}
		}
		return null;
	}

}
