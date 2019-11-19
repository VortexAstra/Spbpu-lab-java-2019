package com.company;

//хищный
public class Predatory extends Animal {

	Predatory(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public double getFoodCount() {
		final double maxFoodCountOmnivores = 25;
		return maxFoodCountOmnivores;
	}


	@Override
	public String getFoodType() {
		return "Food Type is Meat";
	}
}
