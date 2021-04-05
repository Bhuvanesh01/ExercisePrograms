package com.coforge.inher;

public class Vehicle {
	String brand;
	String model;
	int price;

	public Vehicle(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}

	double showDiscountedPrice(int amount) {
		return 0;

	}
}
