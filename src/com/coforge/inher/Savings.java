package com.coforge.inher;

public class Savings extends Account {
 public Savings(double balance) 
 {
	 super(balance);
	 
 }
 
 void withdraw(int amount) {
		balance = balance - amount - 100;
		System.out.println("Savings Withdrawing " + amount);
	}

	void deposit(int amount) {
		balance =balance + amount + 100;
		System.out.println("Savings Depositing " + amount);
	}
}
