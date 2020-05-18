package com.md.endava.ocp.generics_and_collections.generics.generictype;

public class Product<T> {

	private T type;

	private T price;

	public Product(T type, T price) {
		this.type = type;
		this.price = price;
	}

	public Product(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public T getPrice() {
		return price;
	}

	public void setPrice(T price) {
		this.price = price;
	}

	public static <T> T getProductBlaBlaBla(T a) {

		return a;
	}
}
