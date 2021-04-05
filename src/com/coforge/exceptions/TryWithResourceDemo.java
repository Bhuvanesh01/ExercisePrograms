package com.coforge.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceDemo {

	public static void main(String[] args) {
//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);

		try (FileReader fr  = new FileReader("..//DemoProject//sample.txt")){			
			int d =0 ;
			do {
				 d = fr.read();
				 System.out.print((char)d);
			} while (d != -1);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" Completed");
		}
}	


