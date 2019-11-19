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
	public double getFoodCount() {
		final double maxFoodCountOmnivores = 12;
		return maxFoodCountOmnivores;
	}

	/* Random
	double foodCount = 1 + Math.random() * 3;
	if(gender.equals("male")||gender.equals("Male"))

	{
		foodCount = foodCount * 5.5;
	}
		return Math.floor(foodCount); */

	@Override
	public String getFoodType() {
		return "Food Type is anything";
	}
}
