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
	public String getFoodCount() {

		double foodCount = 1 + Math.random() * 3;

		if (gender.equals("male") || gender.equals("Male")) {
			foodCount = foodCount * 5.5;
		}

		return "Predatory need " + Math.floor(foodCount) + " kg eating";
	}

	@Override
	public String getFoodType() {
		return "Food Type is Meat";
	}
}
