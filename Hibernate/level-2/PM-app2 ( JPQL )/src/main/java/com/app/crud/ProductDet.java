package com.app.crud;

public class ProductDet {

	private String name;
	private double price;

	public ProductDet(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDet [name=" + name + ", price=" + price + "]";
	}

}
