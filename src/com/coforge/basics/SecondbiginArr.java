package com.coforge.basics;

import java.util.Scanner;

public class SecondbiginArr {

	public static void main(String[] args) {
		int big;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the values : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for(int i=0; i<array.length;i++)
		{ for(int j=i+1; j<array.length;j++)
			if(array[i]>array[j])
			{
				big = array[i];
				array[i]=array[j];
				array[j]=big;
			}
		}
		System.out.println("The Second Largest Number in the Array is: " + array[size - 2]);
		sc.close();
	}

}
