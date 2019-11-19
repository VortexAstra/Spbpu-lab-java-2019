package com.company;

//Травоядные

public class Herbivores extends Animal {
	Herbivores(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public double getFoodCount() {
		final double maxFoodCountOmnivores = 2;
		return maxFoodCountOmnivores;
	}

	@Override
	public String getFoodType() {
		return "Food Type is Herb";
	}

	public void sortByDownFood(){

	}

}
