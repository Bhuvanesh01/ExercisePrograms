package com.coforge.basics;

import java.util.Scanner;

public class ArrayinAscordr {

	public static void main(String[] args) {
		int ascend;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the values : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					ascend = array[i];
					array[i] = array[j];
					array[j] = ascend;
				}
		}
		System.out.println("The array in ascending order : ");
		for (int val : array) {
			System.out.print(val+" ");
		}
		sc.close();
	}
}
