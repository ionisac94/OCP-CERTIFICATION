package com.md.example.ocp.stream.demo2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {


		List<Product> products = Shop.getProducts();

		System.out.println("<<<<<<<<<<<<<<<<<<TO MAP>>>>>>>>>>>>>>>>>>>>>>");

		Map<String, Categories> collect2 = products.
				stream()
				.collect(Collectors.toMap(Product::getName, Product::getCategories));
		collect2.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("<<<<<<<<<<<<<<<<GROUP BY CATEGORIES>>>>>>>>>>>>>>>>>>>");

		Map<Categories, List<Product>> collect1 = products
				.stream()
				.collect(Collectors.groupingBy(Product::getCategories));

		collect1.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("<<<<<<<<<<<<<<<<GROUP BY CATEGORIES AND SET TO A SET<PRODUCT>>>>>>>>>>>>>>>>>>>>");

		Map<Categories, Set<Product>> seCollect = products
				.stream()
				.collect(Collectors.groupingBy(Product::getCategories, Collectors.toSet()));

		seCollect.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("<<<<<<<<<<<<<<<<GROUP BY CATEGORIES AND SUM RESULT TO DOUBLE>>>>>>>>>>>>>>>>>>>");

		Map<Categories, Double> collect = products
				.stream()
				.collect(Collectors.groupingBy(Product::getCategories, Collectors.summingDouble(Product::getPrice)));

		collect.forEach((k, v) -> System.out.println(k + ": " + v));


		System.out.println("<<<<<<<<<<<<<<<<GROUP BY CATEGORIES AND COUNT RESULT>>>>>>>>>>>>>>>>>>>");

		Map<Categories, Long> countCollect = products
				.stream()
				.collect(Collectors.groupingBy(Product::getCategories, Collectors.counting()));

		countCollect.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("<<<<<<<<<<<<<<<<PARTITIONING BY A BOOLEAN CONDITION>>>>>>>>>>>>>>>>>>>");


		Map<Boolean, List<Product>> collect3 = products
				.stream()
				.collect(Collectors.partitioningBy(p -> p.getPrice() >= 100.0));

		collect3.forEach((k, v) -> System.out.println(k + ": " + v));


		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<OTHER EXAMPLES>>>>>>>>>>>>>>>>>>>>>>>>>");


		products.stream()
				.map(product -> product.getPrice());

		OptionalDouble max = products.stream()
				.mapToDouble(product -> product.getPrice())
				.min();


		products.stream()
				.sorted(Comparator.comparing(Product::getPrice))
				.collect(Collectors.toSet())
				.forEach(e -> System.out.println(e));


	}
}
