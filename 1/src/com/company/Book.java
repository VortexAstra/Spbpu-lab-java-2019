package com.company;

class Book {
	 final String author;
	 final String title;
	 final int publishYear;

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