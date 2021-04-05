package com.coforge.sorting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialProduct {
	public static void main(String[] args) {
		
		
		ArrayList<Product> productList = new ArrayList<>();
		Product p1 = new Product("TV","Electronics","Sony",50000.0);
		Product p2 = new Product("Laptop","Electronics","Asus",80000.0);
		Product p3 = new Product("TV","Electronics","LG",70000.0);
		Product p4 = new Product("Yeezy","Shoes","Addidas",30000.0);
		Product p5 = new Product("Chair","Furniture","Ikea",5000.0);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		
		try ( FileOutputStream fs = new FileOutputStream("product.ser");
				  ObjectOutputStream os = new ObjectOutputStream(fs);) 
			{
				os.writeObject(productList);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
}
}