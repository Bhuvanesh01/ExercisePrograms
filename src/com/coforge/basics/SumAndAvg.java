package com.coforge.basics;

import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		System.out.println("Enter the Size of the array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Values: ");
		for(int i=0; i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		int average = 0;
		
		for(int val : array)
		{
			sum += val;
		}
		average = sum/size;
		System.out.println("The sum of values in array is : "+sum);
		System.out.println("The Average of values in array is : "+average);
		sc.close();
	}

}
