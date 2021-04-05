package com.coforge.lambdaExp;

public class Student {
	
	String name;
	String city;
	
	void printDetails(String name,String city,StudDetails details,int...marks ){
	System.out.println("Name: "+name);
	System.out.println("City: "+city);
	System.out.println("Average marks: "+details.getAverage(marks));
	}
}
