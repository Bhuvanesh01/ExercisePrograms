package com.coforge.lambdaExp;

public class EmpDetails {

	void showBonus(String name,String desg, BonusCalculator c, int amount){
		System.out.println("Welcome " +name);
		System.out.println("Designation:"+desg);
		System.out.println("Bonus For you is : "+c.calculateBonus(amount));
	}
}
