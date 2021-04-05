package com.coforge.inher;

public class Bike extends Vehicle {

	int mileage;

	public Bike(String brand, String model, int price, int mileage) {
		super(brand, model, price);
		this.mileage = mileage;
	}

	double showDiscountedPrice(int amount) {
		amount = price - amount;
		return amount;

	}

	void showMileage() {
		System.out.println("Mileage :" + mileage + " Km/L");
	}
}
