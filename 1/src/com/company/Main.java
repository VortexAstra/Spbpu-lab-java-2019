package com.company;

public class Main {

	public static void main(String[] args) {

		try {
			Matrix matrix = new Matrix();
			matrix.task1();

			LineFragments fragments = new LineFragments();
			fragments.task2();

			LibraryManager lb = new LibraryManager(5);
			// Test Task 3 //
			lb.testLibrary();

			lb.getBook(1);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
