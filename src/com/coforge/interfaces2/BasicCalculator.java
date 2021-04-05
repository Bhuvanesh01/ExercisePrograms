package com.coforge.interfaces2;

public class BasicCalculator implements Calculator {

	@Override
	public void addition(int x, int y) {
		System.out.println("Sum: "+ (x+y));
		
	}

	@Override
	public void difference(int x, int y) {
		System.out.println("Difference: "+ (x-y));		
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product: "+ (x*y));		
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Divide: "+ (x/y));		
	}

}
