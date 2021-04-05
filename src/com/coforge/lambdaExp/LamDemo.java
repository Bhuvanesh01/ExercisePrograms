package com.coforge.lambdaExp;

public class LamDemo {

	public static void main(String[] args) {
		 Greeter msg = (message) -> {
			 System.out.println(" Have a great day"+message);
		 };
		 Greeter msg2 = (message) -> {
			 System.out.println(" Hello there "+message);
		 };
		 Greeter msg3 = (message) -> {
			 System.out.println(" Welcome"+message);
		 };
		 
		 msg.greetMessage(" Bhuvanesh");
		 msg2.greetMessage(" Bhuvanesh");
		 msg3.greetMessage(" Bhuvanesh");
	}

}
