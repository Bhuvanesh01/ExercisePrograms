package com.coforge.lambdaExp;

public class LambdaDemo {

	public static void main(String[] args) {
	Calculator cal = (x,y) -> {
			System.out.println("Sum: "+ (x+y));
		};
		cal.calculate(5, 5);
		cal = (x,y) -> {
			System.out.println("Diff: "+ (x-y));
		};
		cal.calculate(25, 5);
		cal = (x,y) -> {
			System.out.println("prod: "+ (x*y));
		};
		cal.calculate(25, 5);
		cal = (x,y) -> {
			System.out.println("Divide: "+ (x/y));
		};
		cal.calculate(45, 5);
	}

}
