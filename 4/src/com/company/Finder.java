package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Scanner;


class Finder {

	void readFiles(File baseDirectory) {
		if (baseDirectory.isDirectory()) {
			for (File file : Objects.requireNonNull(baseDirectory.listFiles())) {

				if (file.isFile()) {
					System.out.println(file.getName() + " - Файл");
				} else {
					System.out.println(file.getName() + " - Каталог");
					readFiles(file);
				}
			}
		}
	}

	void addNewFile(String path) throws IOException {


		String fileName = new Scanner(System.in).nextLine();

		File file = new File(path, fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	void deleteNewFile(String path) {

		String fileName = new Scanner(System.in).nextLine();

		File file = new File(path, fileName);
		file.delete();
	}

	void addTextOnFile(File directory, String string) {
		try {
			FileWriter fileWriter = new FileWriter(directory, false);
			fileWriter.append(string);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	boolean checkFileOnDirectory(File directory, String fileName) {
		return Files.exists(directory.toPath());
	}


}
