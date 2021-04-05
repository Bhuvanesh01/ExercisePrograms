package com.coforge.sort;

public class Mobile implements Comparable<Mobile> {
	private String model;
	private Double price;
	private String brand;
	public Mobile(String model, Double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Mobile o) {
		return this.getBrand().compareTo(o.getBrand());
	}
	
}
