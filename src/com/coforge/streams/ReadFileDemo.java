package com.coforge.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileDemo {

	public static void main(String[] args) {
//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(ir);

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("..\\DemoProject\\sample.txt");
			fw = new FileWriter("sampleee.txt",true);
			int d =0 ;
			do {
				 d = fr.read();
				fw.write(d);
			} while (d != -1);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null && fw !=null)
					fr.close();
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" Completed");

	}

}
