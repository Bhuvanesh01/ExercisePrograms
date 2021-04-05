package com.coforge.interfaces2;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc = new BasicCalculator();
		calc.addition(5,5);
		calc.difference(85,5);
		calc.product(95,5);
		calc.divide(155,5);
		
		Scientific cal = (Scientific)calc;
 		cal.cube(5);
		cal.square(3);
		
		
	}

}
