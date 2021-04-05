package com.coforge.interfaces;

public class Television extends Gadgets  {

	public Television(String model, double price) {
		super(model,price);
	}

	@Override
	public void showAccessories() {
		System.out.println("set-top box");
	}

	@Override
	public void getDiscountedPrice(int amount) {
		System.out.println("discounted price: "+(price-amount));
		
	}

}
