package com.coforge.threads;

public class Trainer {
	
	String answerQuery(String name, String question) {
		System.out.println("In Trainer");
		System.out.println("Question by: "+ name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Question: "+question);
		return question;
		
	}
}
