package com.md.example.ocp.stream.demo2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Shop {

	public static List<Product> getProducts() {

		ArrayList<Product> productArrayList = new ArrayList<>();

		Product product1 = new Product(12.2, "Brinza", Categories.LACTATE, LocalDate.now());
		Product product2 = new Product(12.1, "Lapte", Categories.LACTATE, LocalDate.now());
		Product product3 = new Product(15.4, "Sampanie", Categories.BAUTURI, LocalDate.now());
		Product product4 = new Product(15.56, "Vin", Categories.BAUTURI, LocalDate.now());
		Product product5 = new Product(14.7, "Struguri", Categories.LEGUME, LocalDate.of(2019, Month.JANUARY, 1));
		Product product6 = new Product(10.2, "Ciresi", Categories.LEGUME, LocalDate.of(2019, Month.FEBRUARY, 4));
		Product product7 = new Product(22, "Tigari", Categories.NARCOTICE, LocalDate.of(2015, Month.APRIL, 4));
		Product product8 = new Product(123, "Marijuana", Categories.NARCOTICE, LocalDate.of(2016, Month.MAY, 4));


		productArrayList.add(product1);
		productArrayList.add(product2);
		productArrayList.add(product3);
		productArrayList.add(product4);
		productArrayList.add(product5);
		productArrayList.add(product6);
		productArrayList.add(product7);
		productArrayList.add(product8);

		return productArrayList;
	}

}
