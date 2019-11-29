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

	private void addBook(final Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				return;
			}
		}
	}

	private void deleteBook(final int index) {
		books[index] = null;
	}

	void getBook(final int index) {
		if (index < 0) {
			throw new IllegalArgumentException("Index can't be negative");
		}

		System.out.print(books[index]);
	}

	//Find on Lib
	private void findByTitle(String title) {
		for (Book book : books) {
			if (book.title.equals(title)) {
				System.out.println(book);
			}
			return;
		}
	}

	private void findByAuthor(String author) {
		for (Book book : books) {
			if (book.author.equals(author)) {
				System.out.println(book);
			}
			return;
		}
	}

	private void findByYear(int Year) {
		for (Book book : books) {
			if (book.publishYear == Year) {
				System.out.println(book);
			}
			return;
		}
	}



	void testLibrary() {
		Book b1 = new Book("Name1", "Author1", 2001);
		Book b2 = new Book("Name2", "Author2", 2002);

		addBook(b1);
		addBook(b2);

		findByYear(2001);
		findByAuthor("Author1");
		findByTitle("Name1");

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