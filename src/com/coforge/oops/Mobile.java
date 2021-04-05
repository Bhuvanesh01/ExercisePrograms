package com.coforge.oops;

public class Mobile {

	String brand;
	String model;
	double price;

	public Mobile(String brand, String model, double price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("Name: " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price: " + price);
	}

	public double showDiscountedPrice(double amount) {
		amount = price-amount;
		return amount;
	}
}
