package com.coforge.sorting;

import java.io.Serializable;

public class Product implements Serializable {
		
		private String name;
		private String category;
		private String brand;
		private double price;
		public Product(String name, String category, String brand, double price) {
			super();
			this.name = name;
			this.category = category;
			this.brand = brand;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", category=" + category + ", brand=" + brand + ", price=" + price + "]";
		}
		
}
