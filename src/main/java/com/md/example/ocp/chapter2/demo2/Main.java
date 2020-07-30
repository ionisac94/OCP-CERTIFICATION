package com.md.example.ocp.chapter2.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Cildren cildren = new Cildren("Tomy", "Eager", "1995", 24);
		Cildren cildren2 = new Cildren("Stephen", "Sharpe", "1990", 30);
		Cildren cildren3 = new Cildren("Alex", "Ivan", "1980", 40);

		Parent parent1 = new Parent.ParentBuilder("Jean", "MacTomy", "str.Arborilor", "+373 02349532").build();
		Parent parent2 = new Parent.ParentBuilder("Kane", "Fargie", "str.Studentilor", "+373 22346").setCildren(cildren).build();
		Parent parent3 = new Parent.ParentBuilder("Tom", "Forecast", "str.Gura Bicului", "+373 45689776").setCildren(cildren2).build();
		Parent parent4 = new Parent.ParentBuilder("Alex", "Alexandru", "str.London Bredge", "+373 09034566").setCildren(cildren3).build();


		List<Parent> parentList = new ArrayList<>();

		parentList.add(parent1);
		parentList.add(parent2);
		parentList.add(parent3);
		parentList.add(parent4);

		List<Cildren> allCildren = getAllCildren(parentList);

		List<Cildren> allCildrenWithJava8 = getAllCildrenWithJava8(parentList);
//		List<Cildren> allCildrenWithJava8Predicate = getAllCildrenWithJava8Predicate(parentList, parent -> parent.getCildren() != null);
		getAllWithAPredicate(parentList);

	}


	public static List<Cildren> getAllCildren(List<Parent> parentList) {

		List<Cildren> cildrenList = new ArrayList<>();


		for (Parent parents : parentList) {
			Cildren cildren = parents.getCildren();
			if (cildren != null) {
				cildrenList.add(cildren);
			}
		}
		return cildrenList;
	}

	public static List<Cildren> getAllCildrenWithJava8(List<Parent> parentList) {

		List<Cildren> collect = parentList
				.stream()
				.filter(parent -> parent.getCildren() != null)
				.map(Parent::getCildren)
				.peek(System.out::println)
				.collect(Collectors.toList());
		return collect;

	}


	public static void getAllWithAPredicate(List<Parent> list) {
		getAllCildrenWithJava8xPredicate(list, parent -> parent.getCildren() != null);
	}


	private static List<Cildren> getAllCildrenWithJava8xPredicate(List<Parent> parentList, Predicate<Parent> predicate) {
		List<Cildren> collect = parentList
				.stream()
				.filter(predicate)
				.map(Parent::getCildren)
				.peek(System.out::println)
				.collect(Collectors.toList());
		return collect;

	}
}
