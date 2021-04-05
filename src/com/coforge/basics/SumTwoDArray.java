package com.coforge.basics;

import java.util.Scanner;

public class SumTwoDArray {

	public static void main(String[] args) {
		int row, total=0, average=0;
		int column;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		row = sc.nextInt();
		System.out.println("Enter the number of column: ");
		column = sc.nextInt();
		int[][] marks = new int[row][column];
		System.out.println("Enter the values: ");
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				marks[i][j] = sc.nextInt(); 
			}
		}
		for(int[] rows : marks)
		{
			for(int val:rows)
				total+=val;
		}
		average=total/(row*column);
		System.out.println("The sum is : "+ total);
		System.out.println("The average is : "+ average);
		sc.close();
	}
	}


