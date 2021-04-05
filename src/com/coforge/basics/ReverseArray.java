package com.coforge.basics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the values : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length/2; i++) {
			temp=array[i];
			array[i] = array[size-i-1];
			array[size-i-1]=temp;
			
		}
		System.out.println("The array in reverse order : ");
		for (int val : array) {
			System.out.print(val + " ");

		}
		sc.close();
	}
}
