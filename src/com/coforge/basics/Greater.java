package com.coforge.basics;

public class Greater {

	public static void main(String[] args) {
		int a=10,b=5,c=3;
		int temp = a>b ? a:b ;
		int big= c>temp ? c : temp;
		System.out.println("the greatest number is : " + big);
	}

}
