package com.coforge.threads;

public class QueryRun {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Student Student = new Student("Ram", "Question 1", trainer);
		Student Student2 = new Student("Rose","Question 2" , trainer);
		Student Student3 = new Student("Rohan","Question 3" , trainer);
	}

}
