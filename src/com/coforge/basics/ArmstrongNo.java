package com.coforge.basics;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int originalNumber, remainder, result = 0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		originalNumber = number;
		while (originalNumber!=0)
		{
			remainder = originalNumber % 10;
			result = result + (remainder*remainder*remainder);
			originalNumber /= 10;
		}
		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
		sc.close();
	}
}
