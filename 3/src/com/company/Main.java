package com.company;

public class Main {

	public static void main(String[] args) {
		StringBuilderWithUndo stringBuilderWithUndo = new StringBuilderWithUndo("Java > ");
		stringBuilderWithUndo.append("C++");
		stringBuilderWithUndo.undo();
		System.out.println(stringBuilderWithUndo);
	}
}

