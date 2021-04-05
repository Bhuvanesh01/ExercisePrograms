package com.coforge.interfaces;

public class Laptop extends Gadgets implements Insurance {
	
	public Laptop(String model, double price) {
		super(model,price);
	}
	
	@Override
	public void showAccessories() {
		System.out.println("Usb Mouse, Bag");
	}

	@Override
	public void getInsDetails() {
		System.out.println("For Accidental Damage");
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("Discounted Price : "+(price-amount));
	}

	

	

}
