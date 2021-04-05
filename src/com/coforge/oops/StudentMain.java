package com.coforge.oops;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Student: ");
		String name = sc.nextLine();
		System.out.println("Enter the Id of the Student");
		int stuId = sc.nextInt();
		System.out.println("Enter the number of Subjects: ");
		int size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter the marks : ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		Student student = new Student(name,stuId);
		student.getDetails();
		student.getGrades(marks);
		sc.close();
	}

}
