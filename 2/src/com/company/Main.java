package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {

			ArrayList<Animal> animalsZoo = new ArrayList<>();

			//Create Animals
			Herbivores herbivores = new Herbivores(9, "Timon", 50, "Male");
			Herbivores herbivores1 = new Herbivores(8, "Giraffe", 50, "Male");
			Herbivores herbivores2 = new Herbivores(7, "Yak", 50, "Male");

			Omnivores omnivores = new Omnivores(6, "Pumba", 20, "Male");
			Omnivores omnivores1 = new Omnivores(5, "Chipmunks", 20, "Male");
			Omnivores omnivores2 = new Omnivores(4, "Hedgehogs", 20, "Male");

			Predatory predatory = new Predatory(3, "Mufasa", 40, "Male");
			Predatory predatory2 = new Predatory(2, "Manky", 10, "Male");
			Predatory predatory3 = new Predatory(1, "Giraffe", 210, "Male");

			//Add
			animalsZoo.add(herbivores);
			animalsZoo.add(herbivores1);
			animalsZoo.add(herbivores2);

			animalsZoo.add(omnivores);
			animalsZoo.add(omnivores1);
			animalsZoo.add(omnivores2);

			animalsZoo.add(predatory);
			animalsZoo.add(predatory2);
			animalsZoo.add(predatory3);

			/** Sort Task A */
			for (int i = animalsZoo.size() - 1; i > 0; --i) {
				for (int j = 0; j < i; ++j) {
					if (animalsZoo.get(j).getFoodCount() < animalsZoo.get(j + 1).getFoodCount()) {
						Animal temp = animalsZoo.get(j);
						animalsZoo.set(j, animalsZoo.get(j + 1));
						animalsZoo.set(j + 1, temp);

					} else if (animalsZoo.get(j).getFoodCount() == animalsZoo.get(j + 1).getFoodCount()) {
						if (animalsZoo.get(j).name.compareTo(animalsZoo.get(j + 1).name) > 0) {
							Animal temp = animalsZoo.get(j);
							animalsZoo.set(j, animalsZoo.get(j + 1));
							animalsZoo.set(j + 1, temp);
						}
					}
				}
			}

			/**Print only 5 Task B */
			for (int i = 0; i < 5; ++i) {
				System.out.println(animalsZoo.get(i).id + " "
						+ animalsZoo.get(i).name + " "
						+ animalsZoo.get(i).getFoodType() + " "
						+ animalsZoo.get(i).getFoodCount() + " kg ");
			}
			System.out.println();

			/** Task C*/
			for (int i = animalsZoo.size() - 3; i < animalsZoo.size(); ++i) {
				System.out.println(animalsZoo.get(i).id);
			}

			/** Task D Write */
			File file = new File("src/com/company/res.txt");

			if (!file.exists())
				file.createNewFile();

			PrintWriter printWriter = new PrintWriter(file);

			for (Animal animal : animalsZoo) {
				printWriter.print(animal.id + " " + animal.name + " " +
						animal.age + "\n");
			}
			printWriter.close();

			/** Read*/

			bufferedReader = new BufferedReader(new FileReader("src/com/company/res.txt"));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException | IllegalStateException e) {
			System.out.println("Error: " + e);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				assert bufferedReader != null;
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
