package com.coforge.interfaces;

public class GadInterDemo {

	public static void main(String[] args) {
		Gadgets tv = new Television("samsung",90000);
		tv.getDetails();
		tv.getDiscountedPrice(9000);
		
//		Insurance ins =(Insurance)tv;
//		ins.getInsDetails();
		
		Accessories acc = (Accessories)tv;
		acc.showAccessories();
		
		Laptop lap = new Laptop("Hp",50000);
		lap.getDetails();
		lap.getDiscountedPrice(50);
		lap.showAccessories();
		lap.getInsDetails();
	}

}
