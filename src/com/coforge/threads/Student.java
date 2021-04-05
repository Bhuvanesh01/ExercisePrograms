package com.coforge.threads;

class Student implements Runnable {
	String name;
	String question;
	Trainer trainer;

	
	public Student(String name, String question, Trainer trainer) {
		super();
		this.name = name;
		this.question = question;
		this.trainer = trainer;
		Thread t = new Thread(this, name);
		t.start();
	}


	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println("" + name);
			synchronized (trainer) {
				trainer.answerQuery(name, question);
			}
		}
	}
}