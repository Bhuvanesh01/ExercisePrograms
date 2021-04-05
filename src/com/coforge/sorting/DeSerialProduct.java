package com.coforge.sorting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DeSerialProduct {

	public static void main(String[] args) {
		try (FileInputStream fin = new FileInputStream("product.ser");
				ObjectInputStream os = new ObjectInputStream(fin);) {
			ArrayList<Product> prodList = (ArrayList) os.readObject();
			ArrayList<Product> prodByCat = new ArrayList<>();
			String category = "Electronics";
			for (Product prod : prodList) {
				if (prod.getCategory().equalsIgnoreCase(category)) {
					prodByCat.add(prod);
				}
			}
			
			Comparator<Product> sl =(Product p1, Product p2)->{
				return p1.getBrand().compareTo(p2.getBrand());
				};
				Collections.sort(prodByCat,sl);
				for(Product product: prodByCat) {
					System.out.println(product);
				}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
