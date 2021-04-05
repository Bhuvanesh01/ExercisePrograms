package com.coforge.lambdaExp;

public class sampleDemo  {

	public static void main(String[] args) {
		BonusCalculator bonusD = (amt) ->{System.out.println("Bonus For Developer: ");
		return amt*5;} ;
		BonusCalculator bonusM = (amt) ->{System.out.println("Bonus For Manager : ");
		return amt*3;} ;
		BonusCalculator bonusA = (amt) ->{System.out.println("Bonus For Admin : ");
		return amt*2;
		} ;
		
		bonusD.calculateBonus(8000);
		bonusA.calculateBonus(5000);
		bonusM.calculateBonus(9000);
	}


}
