package com.coforge.lambdaExp;

public class EmpMain {

	public static void main(String[] args) {
		EmpDetails ed = new EmpDetails();
		ed.showBonus("Ram","Manager",(amt) ->{System.out.println("Bonus For Manager: ");
		return amt*5;},5000);
		ed.showBonus("Rose","Developer",(amt) ->{System.out.println("Bonus For Developer : ");
		return amt*3;},4000);
		ed.showBonus("Helen","Admin",(amt) ->{System.out.println("Bonus For Admin: ");
		return amt*2;},9000);
	}

}
