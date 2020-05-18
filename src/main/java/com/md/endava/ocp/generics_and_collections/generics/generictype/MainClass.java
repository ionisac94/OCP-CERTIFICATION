package com.md.endava.ocp.generics_and_collections.generics.generictype;

public class MainClass {

	public static void main(String[] args) {

		Product<String> product = new Product<>("hello", "123.2");

		Product<? extends Object> product2 = new Product<>("hello");

		Product<? super B> product3 = new Product<A>(new C());

		product3.setPrice(new B());
		product3.setPrice(new C());



	}
}
