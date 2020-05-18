package com.md.endava.ocp.stream.demo2;

import java.time.LocalDate;

public class Product {

	private double price;

	private String name;

	private Categories categories;

	private LocalDate exipyDate;

	public Product(double price, String name, Categories categories, LocalDate exipyDate) {
		this.price = price;
		this.name = name;
		this.categories = categories;
		this.exipyDate = exipyDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public LocalDate getExipyDate() {
		return exipyDate;
	}

	public void setExipyDate(LocalDate exipyDate) {
		this.exipyDate = exipyDate;
	}

	@Override
	public String toString() {
		return "Product{" +
				"price=" + price +
				", name='" + name + '\'' +
				", categories=" + categories +
				", exipyDate=" + exipyDate +
				'}';
	}
}
