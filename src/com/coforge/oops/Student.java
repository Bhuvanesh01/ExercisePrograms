package com.coforge.oops;

public class Student {
	String name;
	int stuId;
	public Student(String name, int stuId)
	{
		this.name = name;
		this.stuId = stuId;
	}
	public void getDetails() {
		System.out.println("Name: "+name);
		System.out.println("Student ID : "+stuId);
	}
	void getGrades(int[] marks)
	{   
		int total = 0;
		int average = 0;
		for (int val : marks)
		{
			total += val;
		}
		average = total/marks.length;
		System.out.println("Total Marks : "+ total);
		System.out.println("Average Marks : "+average);
		if(average > 90)
		{
			System.out.println("Grade : A");
		}
		else if (average > 65)
		{
			System.out.println("Grade : B");
		}
		else
		{
			System.out.println("Grade : C");
		}
	}
}
