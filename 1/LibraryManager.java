package com.company;


import java.util.Arrays;

public class LibraryManager {

	final private Book[] books;

	LibraryManager(final int size) {
		if (size < 0) {
			throw new NegativeArraySizeException("Massive cant be negative ");
		}
		books = new Book[size];
	}

	void addBook(final Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				return;
			}
		}
	}

	void deleteBook(final int index) {
		boolean result = books[index] != null;
		books[index] = null;

	}

	void getBook(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("Index can't be negative");
		}

		System.out.print(books[index]);
	}


	void testLibrary() {
		Book b1 = new Book("Name1", "Author1", 2001);
		Book b2 = new Book("Name2", "Author2", 2002);
		Book b3 = new Book("Name3", "Author3", 2003);
		Book b4 = new Book("Name4", "Author4", 2004);
		addBook(b1);
		addBook(b2);
		addBook(b3);
		addBook(b4);

		System.out.println("After adding");
		System.out.println(this);
		deleteBook(1);
		deleteBook(4);

		System.out.println("After removing");
		System.out.println(this);

	}

	@Override
	public String toString() {
		return "LibraryManager [books = " + Arrays.toString(books) + "]";
	}
}