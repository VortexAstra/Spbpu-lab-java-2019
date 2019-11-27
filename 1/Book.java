package com.company;

class Book {
	private final String author;
	private final String title;
	private final int publishYear;

	Book() {
		this("Дэн Браун", "Точка обмана", 2001);
	}

	Book(String bookName, String bookAuthor, int year) {
		author = bookAuthor;
		title = bookName;
		publishYear = year;
	}

	@Override
	public String toString() {
		return "Book [author = " + author + ", publishYear = " + publishYear + ", title = " + title + "]";
	}
}