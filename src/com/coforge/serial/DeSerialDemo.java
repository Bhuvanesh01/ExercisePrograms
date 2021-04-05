package com.coforge.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {

	public static void main(String[] args) { 
		try (
			FileInputStream fin = new FileInputStream("stud.ser");
			ObjectInputStream os = new ObjectInputStream(fin);)	
		{
			Student st = (Student) os.readObject();
			System.out.println(st);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} 		
	}
}
