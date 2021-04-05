package com.coforge.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileDemo2 {

	public static void main(String[] args) {
//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);

		FileReader fr = null;
		try {
			fr = new FileReader("..//DemoProject//sample.txt");
			int d =0 ;
			do {
				 d = fr.read();
				 System.out.print((char)d);
			} while (d != -1);	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" Completed");

	}

}
