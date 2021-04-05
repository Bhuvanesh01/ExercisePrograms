package com.coforge.basics;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number)
		{
			System.out.println("Perfect Number");
		}
		else 
		{
			System.out.println("Not a Perfect Number");
		}
		sc.close();
	}

}
