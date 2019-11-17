package com.company;

//всеядных

public class Omnivores extends Animal {

	Omnivores(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String getFoodCount() {

		double foodCount = 1 + Math.random() * 5;

		if (gender.equals("male") || gender.equals("Male")) {
			foodCount = foodCount * 5.5;
		}

		return "Omnivores need " + Math.floor(foodCount) + " kg eating";
	}

	@Override
	public String getFoodType() {
		return "Food Type is anything";
	}
}
