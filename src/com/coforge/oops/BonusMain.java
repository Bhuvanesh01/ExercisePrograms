package com.coforge.oops;

import java.util.Scanner;

public class BonusMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Designation: ");
		String designation = sc.nextLine();
		EmployeeBonus eb = new EmployeeBonus("Rohan","Manager");
		
		EmployeeBonus eb2 = new EmployeeBonus("Rose","Programmer");
		
		EmployeeBonus eb3 = new EmployeeBonus("Alex","Director");
		
		if(designation.equals("Programmer"))
		{   
			System.out.println("Name : "+eb.name);
			System.out.println("Basic Allowance is "+eb.calcBonus(500));
		}
		else if(designation.equals("Manager"))
		{
		
			System.out.println("Name : "+eb2.name);
			System.out.println("Basic Allowance is "+eb2.calcBonus(500,1000));
		}
		else if (designation.equals("Director")) {
			System.out.println("Name : "+eb3.name);
			System.out.println("Basic Allowance is "+eb3.calcBonus(500,1000,500));
		}
		else {
			System.out.println("Wrong Entry");
		}
		
		sc.close();

	}

}
