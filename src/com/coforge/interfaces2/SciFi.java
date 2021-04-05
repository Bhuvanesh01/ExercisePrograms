package com.coforge.interfaces2;

public class SciFi extends BasicCalculator implements Scientific {

	@Override
	public void square(int x) {
		System.out.println("Square "+(x*x));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube "+(x*x*x));		
	}

}
