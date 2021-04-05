package com.coforge.basics;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next ;
		System.out.println("Enter the number upto which you want Fibonaci Sequence: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("The Fibonaci Sequence is : "+first+","+second);
		while(number>0)
		{
			next = first + second;
			first = second;
			second = next;
			System.out.print(","+next);
			number--;
		}
		sc.close();
	}

}
