package com.coforge.basics;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		int size, total=0, average=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter the values: ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = sc.nextInt();
		}
		for(int val:marks)
		{
			total+=val;
			
		}
		average=total/size;
		System.out.println("The sum is : "+ total);
		System.out.println("The average is : "+ average);
		sc.close();
	}

}
