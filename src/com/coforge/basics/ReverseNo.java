package com.coforge.basics;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int reverse = 0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (number != 0) {
			int remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		}
		System.out.println("The Reversed No is : " + reverse);
		sc.close();
	}

}
