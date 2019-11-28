package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";

	public static void main(String[] args) {
		try {
			Finder finder = new Finder();

			System.out.println("Enter your path");
			String path = new Scanner(System.in).nextLine();
			//Print all file in directory
			if ((new File(path)).exists()) {
				System.out.println(ANSI_RED + "THIS PATH IS FOUND" + ANSI_RESET + "\n");
				finder.readFiles(new File(path));
			} else {
				throw new FileNotFoundException("\n" + ANSI_RED + "THIS PATH IS NOT FOUND" + ANSI_RESET);
			}

			System.out.println("\n" + "Whose what do want add or delete" + "\n"
					+ ANSI_RED + "add or delete" + ANSI_RESET);
			String scn = new Scanner(System.in).nextLine();
			//Add and delete
			if (scn.equals("add") || scn.equals("Add")) {
				System.out.println(ANSI_RED + "Enter name of file" + ANSI_RESET);
				finder.addNewFile(path);

			} else if (scn.equals("delete") || scn.equals("Delete")) {
				System.out.println(ANSI_RED + "Enter name of file" + ANSI_RESET);
				finder.deleteNewFile(path);
			} else throw new RuntimeException("ONLY ADD OE DELETE");


			/** Add on File */
			System.out.println("Select a file to write text");
			String fileName = new Scanner(System.in).nextLine();

			boolean temp = finder.checkFileOnDirectory(new File(path + "/" + fileName), fileName);
			if (temp) {
				finder.addTextOnFile(new File(path + "/" + fileName), "KUKU");
			}
			else throw new RuntimeException("Check filename");


		} catch
		(IOException | RuntimeException e) {
			e.printStackTrace();
		}
	}

}
