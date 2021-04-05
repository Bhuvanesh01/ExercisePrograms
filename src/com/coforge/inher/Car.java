package com.coforge.inher;

public class Car extends Vehicle {

	String accessories;

	public Car(String brand, String model, int price, String accessories) {
		super(brand, model, price);
		this.accessories = accessories;
	}

	void showAccessories() {
		System.out.println("Accessories : " + accessories);
	}

	double showDiscountedPrice(int amount) {
		amount = (price / 10) + amount;
		return amount;

	}
}
