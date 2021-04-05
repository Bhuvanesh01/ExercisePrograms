package com.coforge.inher;

public abstract class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(int amount) {
//		balance -= amount;
//		System.out.println("Withdrawing " + amount);
	}

	void deposit(int amount) {
//		balance += amount;
//		System.out.println("Depositing " + amount);
	}
	
	double getBalance() 
	{
		return balance;
	}
}
