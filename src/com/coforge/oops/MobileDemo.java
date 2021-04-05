package com.coforge.oops;

public class MobileDemo {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung","S20",100000);
		//mobile.brand = "Samsung";
		//mobile.model = "S20";
		//mobile.price = 100000;
		// System.out.println(mobile.brand+"\t"+mobile.model+"\t"+mobile.price);
		mobile.getDetails();
		System.out.println("Discounted Price: " + mobile.showDiscountedPrice(500));

		Mobile mobile1 = new Mobile("One Plus","Nord",40000);
		//mobile1.brand = "One Plus";
		//mobile1.model = "Nord";
		//mobile1.price = 40000;
		// System.out.println(mobile1.brand+"\t"+mobile1.model+"\t"+mobile1.price);
		mobile1.getDetails();
		System.out.println("Discounted Price: " + mobile.showDiscountedPrice(2000));
	}
}
