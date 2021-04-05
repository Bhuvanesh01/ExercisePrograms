package com.coforge.inher;

public class Current extends Account {
	public Current(double balance) 
	 {
		 super(balance);
		 
	 }
	 
	 void withdraw(int amount) {
			balance = balance - amount;
			System.out.println("Current Withdrawing " + amount);
		}

		void deposit(int amount) {
			balance =balance + amount ;
			System.out.println("Current  Depositing " + amount);
		}
}
