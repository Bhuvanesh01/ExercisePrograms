package com.coforge.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {

	public static void main(String[] args) {
		Student st = new Student("Rohan", 10, "Sports");
		System.out.println(st);

		try ( FileOutputStream fs = new FileOutputStream("stud.ser");
			  ObjectOutputStream os = new ObjectOutputStream(fs);) 
		{
			os.writeObject(st);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
