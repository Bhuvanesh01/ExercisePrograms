package com.coforge.inher;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Type 'Savings' or 'Current' : ");
		String accType = sc.next();
		Account account;
		switch (accType) {
		case "Savings":
			account = new Savings(2000);
			account.withdraw(300);
			System.out.println("Balance : " + account.getBalance());
			account.deposit(6000);
			System.out.println("Balance : " + account.getBalance());
			break;

		case "Current":

			account = new Current(7000);
			account.withdraw(3000);
			System.out.println("Balance : " + account.getBalance());
			account.deposit(16000);
			System.out.println("Balance : " + account.getBalance());
			break;

		default:
//		account = new Account(5000);	
//		account.withdraw(300);
//		System.out.println("Balance : "+account.getBalance());
//		account.deposit(16000);
//		System.out.println("Balance : "+account.getBalance());
		}
		sc.close();
	}
}
