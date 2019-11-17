package com.company;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			ArrayList<Animal> animalsZoo = new ArrayList<>();

			//Create Animals
			Herbivores herbivores = new Herbivores(1, "Timon", 50, "Male");
			Omnivores omnivores = new Omnivores(2, "Pumba", 20, "Male");
			Predatory predatory = new Predatory(3, "Mufasa", 25, "Male");

			animalsZoo.add(herbivores);
			animalsZoo.add(omnivores);
			animalsZoo.add(predatory);

			



			for (Animal it : animalsZoo) {
				System.out.println(it.name + " " + it.getFoodType() + " " + it.getFoodCount());
			}



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
