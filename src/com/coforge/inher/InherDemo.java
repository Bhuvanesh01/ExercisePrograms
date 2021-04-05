package com.coforge.inher;

import java.util.Scanner;

public class InherDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Bike or Car ' : ");
		String choice = sc.next();
		Vehicle vehicle = null;
		switch(choice)
		{
		case "bike": 
		vehicle = new Bike("Kawasaki","Ninja 1000",5_00_000,10);
		vehicle.getDetails();
		Bike bike = (Bike)vehicle;
		bike.showMileage();
		System.out.println("The Final Price after Discount is :"+vehicle.showDiscountedPrice(5000));
		break;
		case "car":
		vehicle = new Car("Jeep","Compass",25_00_000,"Bose Sound System");
		vehicle.getDetails();
		Car car = (Car)vehicle;
		car.showAccessories();
		System.out.println("The Final Price after Discount is :"+vehicle.showDiscountedPrice(5));
		break;
		default: 
			System.out.println("Wrong choice");
		}
		sc.close();
	}

}
